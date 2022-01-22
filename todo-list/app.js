
//일정 데이터가 들어 있는 배열 선언
const todos = [
    {
        id: 1,
        text: '할 일 1',
        done: false // checkbox를 클릭해서 할 일을 마쳤는지의 여부
    },
    {
        id: 2,
        text: '할 일 2',
        done: false // checkbox를 클릭해서 할 일을 마쳤는지의 여부
    },
    {
        id: 3,
        text: '할 일 3',
        done: false // checkbox를 클릭해서 할 일을 마쳤는지의 여부
    },
];

//추가될 할 일 객체의 id를 생성해 주는 함수 정의.
function makeNewId() {
    if(todos.length > 0) {
        return todos[todos.length-1].id + 1;
    } else {
        return 1;
    }
}

//화면에 표현할 .todo-list-item 노드를 생성하는 함수 정의
function makeNewToDoNode(newTodo) {
    const $li = document.createElement('li');
    const $lable = document.createElement('label');
    const $divMod = document.createElement('div');
    const $divRem = document.createElement('div');

    //label 태그 작업
    $lable.classList.add('checkbox');
    const $check = document.createElement('input');
    $check.setAttribute('type', 'checkbox');
    const $span = document.createElement('span');
    $span.classList.add('text');
    $span.textContent = newTodo.text;
    $lable.appendChild($check);
    $lable.appendChild($span);

    //수정 div태그 작업
    $divMod.classList.add('modify');
    const $modIcon = document.createElement('span');
    //클래스 이름을 두개 add할실 때는 매개값을 두 개 보내셔야 합니다.
    //한번에 공백 포함 두 개 설정하시면 에러입니다.
    $modIcon.classList.add('lnr', 'lnr-undo');
    $divMod.appendChild($modIcon);

    //삭제 div 태그 작업
    $divRem.classList.add('remove');
    const $remIcon = document.createElement('span');
    $remIcon.className = 'lnr lnr-cross-circle';
    $divRem.appendChild($remIcon);

    //li 태그 작업
    $li.dataset.id = newTodo.id;
    $li.classList.add('todo-list-item');


    for(let $ele of [$lable, $divMod, $divRem]) {
        $li.appendChild($ele);
    }

    //ul태그를 지목해서 $li를 자식노드로 추가
    document.querySelector('.todo-list').appendChild($li);

}


//할 일 추가 처리 함수 정의
function insertToDoData() {

    const $todoText = document.getElementById('todo-text');

    //입력값이 없다면 추가 처리하지 않습니다.
    //공백이 들어갈 가능성이 있기 때문에 공백을 제거하고 비교.
    //trim(): 문자열의 앞/뒤 공백을 제거
    if($todoText.value.trim() === '') {
        $todoText.style.background = 'orangered';
        $todoText.setAttribute('placeholder', '필수 입력사항입니다!');
        $todoText.value = '';
        return;
    } else {
        //제대로 입력이 되었다면 속성과 디자인을 초기화
        $todoText.setAttribute('placehoder', '할 일을 입력하세요.');
        $todoText.style.background = '';
    }

    //1. todos 배열에 객체를 생성한 후 추가
    const newTodo = {
        id: makeNewId(),
        text: $todoText.value,
        done: false
    };
    todos.push(newTodo);

    //2. 추가된 데이터를 화면에 표현 (li 태그를 추가)
    makeNewToDoNode(newTodo);

    //3. 입력 완료 후 input에 존재하는 문자열 제거
    $todoText.value = '';

}

//data-id값으로 배열을 탐색하여 일치하는 객체가 들어있는 인덱스 반환
//(할 일 완료 처리를 할 때 필요한 함수)
function findIndexByDataId(dataId) {
    for(let i=0; i<todos.length; i++) {
        if(dataId === todos[i].id) {
            return i;
        }
    }
}


//할 일 완료 처리 수행 함수 정의
function changeCheckState($label) {

    //할 일 완료된 노드의 클래스 이름을 추가 (디자인 부여)
    //checked를 상황에 따라서 추가하거나 삭제할 수 있어야 하기 때문에
    //toggle 함수로 처리해 주겠습니다.
    $label.classList.toggle('checked');

    //dataId를 기반으로 배열을 탐색하여 data-id와 일치하는
    //id 프로퍼티를 가진 객체의 인덱스를 얻어 옵니다.
    const dataId = +$label.parentNode.dataset.id;
    const index = findIndexByDataId(dataId);

    todos[index].done = !todos[index].done;

    console.log(todos);
}

//할 일 삭제 처리 함수 정의
function removeToDoData($delTarget) {
    //애니메이션 적용을 위해 클래스 이름 추가
    $delTarget.classList.add('delMoving');

    //removeChild 진행 전에 애니메이션 발동 및
    //배열 내부에 객체 삭제가 진행될 수 있도록 시간을 지연
    setTimeout(() => {
       document.querySelector('.todo-list').removeChild($delTarget); 
    }, 1500);

    //배열 내에 있는 객체도 삭제를 진행.
    const index = findIndexByDataId(+$delTarget.dataset.id);
    todos.splice(index, 1);

    console.log(todos);

}

//수정 모드 진입 이벤트 함수 
function enterModifyMode($modSpan) {

    //수정 모드 진입 버튼을 교체 (lnr-undo -> lnr-checkmark-circle);
    $modSpan.classList.replace('lnr-undo', 'lnr-checkmark-circle');

    //span.text를 input태그로 교체 (삭제하고 추가)
    const $label = $modSpan.parentNode.previousElementSibling;
    const $textSpan = $label.lastElementChild;

    const $modInput = document.createElement('input');
    $modInput.setAttribute('type', 'text');
    $modInput.classList.add('mod-input');
    $modInput.setAttribute('value', $textSpan.textContent);

    $label.replaceChild($modInput, $textSpan);

}

//수정 완료 이벤트 처리 함수 
function modifyToDoData($modCompleteSpan) {

    //버튼 원래대로 돌리세요.
    $modCompleteSpan.classList.replace('lnr-checkmark-circle', 'lnr-undo');

    //input을 다시 span.text로 변경
    const $label = $modCompleteSpan.parentNode.previousElementSibling;
    const $modInput = $label.lastElementChild;

    const $textSpan = document.createElement('span');
    $textSpan.textContent = $modInput.value;
    $textSpan.classList.add('text');

    $label.replaceChild($textSpan, $modInput);

    const idx = findIndexByDataId(+$label.parentNode.dataset.id);
    todos[idx].text = $textSpan.textContent;

    console.log(todos);
}

//메인 역할을 하는 즉시 실행 함수
(function() {

    //할 일 추가 이벤트
    const $addBtn = document.getElementById('add');
    $addBtn.addEventListener('click', e => {

        //form태그 안의 button은 type을 명시하지 않으면 자동 submit이 실행됩니다.
        e.preventDefault(); //버튼의 고유기능(submit)을 중지.

        insertToDoData();

    });

    //할 일 완료(체크박스) 이벤트
    const $todoList = document.querySelector('ul.todo-list');
    
    $todoList.addEventListener('change', e => {

        if(!e.target.matches('input[type="checkbox"]')) {
            return;
        }

        changeCheckState(e.target.parentNode); //label을 함수의 매개값으로

    });

    //할 일 삭제 이벤트
    $todoList.addEventListener('click', e => {
        if(!e.target.matches('.todo-list .remove span')) {
            return;
        }

        removeToDoData(e.target.parentNode.parentNode);

    });

    //할 일 수정 이벤트
    $todoList.addEventListener('click', e => {
        
        if(e.target.matches('.todo-list .modify span.lnr-undo')) {
            enterModifyMode(e.target); //수정 모드 진입.
        } else if(e.target.matches('.todo-list .modify span.lnr-checkmark-circle')) {
            modifyToDoData(e.target); //수정모드에서 수정을 확정지으려는 이벤트.
        } else {
            return;
        }

    });

} ());
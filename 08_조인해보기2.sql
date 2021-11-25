-- 이너 조인
SELECT * FROM info
INNER JOIN auth 
ON info.auth_id = auth.auth_id;

-- 오라클 문법 (잘 사용 안합니다.)
SELECT * 
FROM info, auth
WHERE info.auth_id = auth.auth_id;

-- auth_id 컬럼을 그냥 쓰시면 모호하다 라고 뜹니다.
-- 그 이유는 양쪽 테이블에 모두 존재하기 때문입니다.
-- 이럴 때 컬럼에 테이블 이름을 쓰시던지, 별칭을 쓰셔서 
-- 지목을 확실하게 해 주세요.
SELECT info.auth_id, title, content, name
FROM info
INNER JOIN auth
ON info.auth_id = auth.auth_id;

-- 필요한 데이터만 조회하겠다! 라고 한다면
-- WHERE 구문을 통해 일반 조건 걸어주시면 됩니다.
SELECT
    i.auth_id, i.title, i.content, a.name
FROM info i
INNER JOIN auth a
ON i.auth_id = a.auth_id
WHERE a.name = '홍길자';

-- 아우터 조인
SELECT *
FROM info i LEFT JOIN auth a
ON i.auth_id = a.auth_id;

-- 오라클 문법
SELECT *
FROM info i, auth a
WHERE i.auth_id = a.auth_id(+);

-- 좌측 테이블과 우측 테이블 데이터를 모두 읽어 중복된 데이터는 삭제되는 외부 조인
SELECT *
FROM info i FULL OUTER JOIN auth a
ON i.auth_id = a.auth_id;

-- CROSS JOIN은 JOIN조건을 설정하지 않기 때문에
-- 모든 컬럼에 대해 JOIN을 진행합니다.
-- 실제로는 거의 사용하지 않습니다.
SELECT * FROM info 
CROSS JOIN auth
ORDER BY id ASC;

-- 여러 테이블 조인 -> 키 값만 찾아서 구문을 연결해서 쓰면 됩니다.
SELECT *
FROM employees e
LEFT OUTER JOIN departments d ON e.department_id = d.department_id
LEFT OUTER JOIN locations loc ON d.department_id = loc.location_id;

/*
- 테이블 별칭 a, i를 이용하여 LEFT OUTER JOIN 사용
- info, auth 테이블을 사용
- job 컬럼이 scientist인 사람의 id, title, content, job을 출력.
*/
SELECT
    i.id, i.title, i.content, a.job
FROM info i RIGHT OUTER JOIN auth a
ON i.auth_id = a.auth_id
WHERE a.job = 'scientist';

















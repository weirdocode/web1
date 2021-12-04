
-- 1. 구구단 중 3단을 출력하는 익명 블록을 만들어 보자 (출력문 9개를 복사해서 쓰세요.)
BEGIN
    DBMS_OUTPUT.PUT_LINE('3 * 1 = ' || 3*1);
    DBMS_OUTPUT.PUT_LINE('3 * 2 = ' || 3*2);
    DBMS_OUTPUT.PUT_LINE('3 * 3 = ' || 3*3);
    DBMS_OUTPUT.PUT_LINE('3 * 4 = ' || 3*4);
    DBMS_OUTPUT.PUT_LINE('3 * 5 = ' || 3*5);
    DBMS_OUTPUT.PUT_LINE('3 * 6 = ' || 3*6);
    DBMS_OUTPUT.PUT_LINE('3 * 7 = ' || 3*7);
    DBMS_OUTPUT.PUT_LINE('3 * 8 = ' || 3*8);
    DBMS_OUTPUT.PUT_LINE('3 * 9 = ' || 3*9);    
END;

-- 2. 사원 테이블에서 201번 사원의 이름과 이메일주소를 출력하는 익명 블록을 만들어 보자
DECLARE
    v_emp_name employees.first_name%TYPE;
    v_emp_email employees.email%TYPE;
BEGIN
    SELECT 
        first_name, email
    INTO
        v_emp_name, v_emp_email
    FROM employees
    WHERE employee_id = 201;
    
    DBMS_OUTPUT.PUT_LINE(v_emp_name || ': ' || v_emp_email);
END;
    

-- 3. 사원 테이블에서 사원번호가 제일 큰 사원을 찾아낸 뒤,
-- 이 번호 + 1번으로 아래의 사원을 emps에
-- employee_id, last_name, email, hire_date, job_id를 신규 입력하는 익명 블록을 만드세요.
-- SELECT절 이후에 INSERT문 사용이 가능합니다.
/*
<사원명>: steven
<이메일>: stevenjobs
<입사일자>: 오늘날짜
<JOB_ID>: CEO
*/

DROP TABLE emps;
CREATE TABLE emps AS (SELECT * FROM employees WHERE 1 = 2);

DECLARE
    v_max_empno employees.employee_id%TYPE;
BEGIN

    SELECT MAX(employee_id)
    INTO v_max_empno
    FROM employees;
    
    INSERT INTO emps 
        (employee_id, last_name, email, hire_date, job_id)
    VALUES
        (v_max_empno + 1, 'steven', 'stevenjobs', sysdate, 'CEO');
    
    COMMIT;
        
END;

SELECT * FROM emps;














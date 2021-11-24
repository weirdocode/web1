
-- 오라클의 주석입니다.

/*
문장 주석입니다~
*/

SELECT * FROM employees;

SELECT employee_id, first_name, last_name
FROM employees;

SELECT email, phone_number, hire_date
FROM employees;

-- 컬럼을 조회하는 위치에서 * / + - 연산이 가능합니다.
SELECT 
    employee_id, 
    first_name, 
    last_name, 
    salary, 
    salary+salary*0.1 
FROM 
    employees;

-- NULL 값의 확인
SELECT department_id, commission_pct
FROM employees;

-- alias(컬럼명의 이름을 변경해서 조회합니다.)
SELECT first_name as 이름, last_name as 성,
salary as 급여 FROM employees;

-- 오라클은 홑따옴표로 문자를 표현하고, 문자열 안에 홑따옴표를
-- 표현하고 싶다면 ''를 두번 연속으로 쓰면 됩니다.
-- || -> 연결자
SELECT 
first_name || ' ' || last_name || '''s salary is $' || salary 
as 급여내역 FROM employees;

-- distinct (중복 행의 제거)
SELECT department_id FROM employees;
SELECT DISTINCT department_id FROM employees;

-- ROWNUM, ROWID 
-- (**로우넘: 쿼리에 의해 반환되는 행 번호를 출력)
-- (로우아이디: 데이터베이스에서 행의 주소값을 반환)
SELECT ROWNUM, ROWID, employee_id
FROM employees;


























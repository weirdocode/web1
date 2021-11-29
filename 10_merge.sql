
-- MERGE: 테이블 병합
/*
UPDATE와 INSERT를 한방에 처리.

한 테이블에 해당하는 데이터가 있다면 UPDATE
없으면 INSERT로 처리해라.
만약 MERGE가 없었다면 해당 데이터의 존재 유무를 일일히 확인하고
if문을 사용해서 데이터가 있다면 UPDATE, 없다면 else문 사용해서
INSERT를 하라고 일일히 얘기해야 하는데, MERGE를 통해 쉽게 처리 가능.
*/

CREATE TABLE emps_it AS (SELECT * FROM employees WHERE 1 = 2);
SELECT * FROM emps_it;

INSERT INTO emps_it
    (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES(105, '데이비드', '김', 'DAVIDKIM', '06/03/04', 'IT_PROG');

SELECT * FROM employees
WHERE job_id = 'IT_PROG';

MERGE INTO emps_it a -- (머지를 할 타겟 테이블)
    USING -- 병합시킬 데이터
        (SELECT * FROM employees WHERE job_id = 'IT_PROG') b -- 조인구문
    ON -- 병합시킬 데이터의 연결 조건
        (a.employee_id = b.employee_id) -- 조인 조건
WHEN MATCHED THEN -- 조건에 일치할 경우 타겟 테이블에 실행
    UPDATE SET
        a.phone_number = b.phone_number,
        a.hire_date = b.hire_date,
        a.salary = b.salary,
        a.commission_pct = b.commission_pct,
        a.manager_id = b.manager_id,
        a.department_id = b.department_id
    /*DELETE WHERE ~~~~ 
        DELETE만 단독으로 쓰일 수 없습니다.
        UPDATE 이후에 DELETE 작성이 가능합니다.
        삭제할 대상 컬럼들을 동일한 값으로 일단 UPDATE를 진행하고
        DELETE의 WHERE절에 아까 지정한 동일한 값을 지정해서 삭제합니다.
    */ 
WHEN NOT MATCHED THEN -- 조건에 일치하지 않는 경우 타겟테이블에 실행.
    INSERT /*속성(컬럼)*/ VALUES
        (b.employee_id, b.first_name, b.last_name,
         b.email, b.phone_number, b.hire_date, b.job_id,
         b.salary, b.commission_pct, b.manager_id, b.department_id);
         
         
-----------------------------------------------------------------------------

INSERT INTO emps_it
    (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES(102, '렉스', '박', 'LEXPARK', '01/04/06', 'AD_VP');
INSERT INTO emps_it
    (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES(101, '니나', '최', 'NINA', '20/04/06', 'AD_VP');
INSERT INTO emps_it
    (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES(103, '흥민', '손', 'HMSON', '20/04/06', 'AD_VP');

-- employees 테이블을 매번 수정되는 테이블이라고 가정하자.
-- 기존의 데이터는 email, phone, salary, commission, man_id, dept_id는
-- 는 업데이트 하도록 처리
-- 새로 유입된 데이터는 그대로 추가.

MERGE INTO emps_it a
    USING 
        (SELECT * FROM employees) b
    ON
        (a.employee_id = b.employee_id)
WHEN MATCHED THEN
    UPDATE SET
        a.email = b.email,
        a.phone_number = b.phone_number,
        a.salary = b.salary,
        a.commission_pct = b.commission_pct,
        a.manager_id = b.manager_id,
        a.department_id = b.department_id
WHEN NOT MATCHED THEN
    INSERT VALUES
        (b.employee_id, b.first_name, b.last_name,
         b.email, b.phone_number, b.hire_date, b.job_id,
         b.salary, b.commission_pct, b.manager_id, b.department_id);


SELECT * FROM emps_it
ORDER BY employee_id ASC;



























-- INSERT
-- 테이블 구조 확인 DESCRIBE
DESC departments;

-- INSERT의 첫번째 방법 (모든 컬럼 데이터를 한번에 지정)
-- 타입에 맞는 값을 지정하여 삽입해야 합니다.
-- 문자나 숫자 타입으로 지정된 곳에 타입에 맞지 않는 데이터를 집어 넣을 때는
-- 자동 형 변환을 시도합니다.
INSERT INTO departments
VALUES (301, 23.3, null, 1700);

SELECT * FROM departments;
ROLLBACK; -- 실행 시점은 다시 뒤로 되돌리는 키워드.

-- INSERT의 두 번째 방법 (직접 컬럼을 지정하고 저장)
INSERT INTO departments
(department_id, location_id)
VALUES (290, 1700);

-- INSERT 연습
INSERT INTO departments
(department_id, department_name, location_id)
VALUES (290, '디자이너', 1700);
INSERT INTO departments
(department_id, department_name, location_id)
VALUES (300, 'DB관리자', 1800);
INSERT INTO departments
(department_id, department_name, location_id)
VALUES (310, '데이터분석가', 1800);
INSERT INTO departments
VALUES (320, '퍼블리셔', 200, 1800);
INSERT INTO departments
VALUES (330, '서버관리자', 200, 1800);

SELECT * FROM departments;
ROLLBACK;

-- 사본 테이블 생성
CREATE TABLE managers AS
(
SELECT employee_id, first_name, job_id, salary, hire_date
FROM employees
WHERE 1 = 2
);

SELECT * FROM managers;

-- INSERT(서브쿼리)
INSERT INTO managers
(
SELECT employee_id, first_name, job_id, salary, hire_date
FROM employees
);

-- UPDATE
CREATE TABLE emps AS (SELECT * FROM employees);
SELECT * FROM emps;

-- CTAS를 사용하면 제약 조건은 NOT NULL 말고는 복사되지 않습니다.
-- 제약조건은 업무규칙을 지키는 데이터만 저장하고, 그렇지 않은 것들이
-- DB에 저장되는 것을 방지하는 목적으로 사용합니다.
ALTER TABLE emps
ADD (CONSTRAINT emps_emp_id_pk PRIMARY KEY (employee_id),
     CONSTRAINT emps_manager_fk FOREIGN KEY (manager_id)
     REFERENCES emps(employee_id));

-- 제약조건 삭제
ALTER TABLE emps DROP CONSTRAINT emps_manager_fk;
ALTER TABLE emps DROP CONSTRAINT emps_emp_id_pk;

-- UPDATE를 진행할 때는 누구를 수정할 지 지목해야 합니다.
-- 그렇지 않으면 수정 대상이 테이블 전체로 지목됩니다.
UPDATE emps SET salary = 30000;
SELECT * FROM emps;
ROLLBACK;

UPDATE emps SET salary = 30000
WHERE employee_id = 100;

UPDATE emps SET salary = salary + salary * 0.1
WHERE employee_id = 100;

UPDATE emps SET manager_id = 100
WHERE employee_id = 100;

SELECT * FROM emps;

UPDATE emps SET
phone_number = '515.123.4566', manager_id = 102
WHERE employee_id = 100;

-- UPDATE (서브쿼리)
UPDATE emps
SET (job_id, salary, manager_id) = 
    (SELECT job_id, salary, manager_id
     FROM emps
     WHERE employee_id = 100)
WHERE employee_id = 101;

SELECT * FROM emps;

ROLLBACK;

-- DELETE
DELETE FROM emps
WHERE employee_id = 103;

SELECT * FROM emps
WHERE employee_id = 103;

-- DELETE (서브쿼리)
DELETE FROM emps
WHERE department_id = (SELECT department_id FROM departments
                        WHERE department_id = 100);

SELECT * FROM emps;

DELETE FROM emps
WHERE department_id = (SELECT department_id FROM departments
                        WHERE department_name = 'IT');


DELETE FROM departments WHERE department_id = 50;




























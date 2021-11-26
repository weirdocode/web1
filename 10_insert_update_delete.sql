
-- INSERT
-- ���̺� ���� Ȯ�� DESCRIBE
DESC departments;

-- INSERT�� ù��° ��� (��� �÷� �����͸� �ѹ��� ����)
-- Ÿ�Կ� �´� ���� �����Ͽ� �����ؾ� �մϴ�.
-- ���ڳ� ���� Ÿ������ ������ ���� Ÿ�Կ� ���� �ʴ� �����͸� ���� ���� ����
-- �ڵ� �� ��ȯ�� �õ��մϴ�.
INSERT INTO departments
VALUES (301, 23.3, null, 1700);

SELECT * FROM departments;
ROLLBACK; -- ���� ������ �ٽ� �ڷ� �ǵ����� Ű����.

-- INSERT�� �� ��° ��� (���� �÷��� �����ϰ� ����)
INSERT INTO departments
(department_id, location_id)
VALUES (290, 1700);

-- INSERT ����
INSERT INTO departments
(department_id, department_name, location_id)
VALUES (290, '�����̳�', 1700);
INSERT INTO departments
(department_id, department_name, location_id)
VALUES (300, 'DB������', 1800);
INSERT INTO departments
(department_id, department_name, location_id)
VALUES (310, '�����ͺм���', 1800);
INSERT INTO departments
VALUES (320, '�ۺ���', 200, 1800);
INSERT INTO departments
VALUES (330, '����������', 200, 1800);

SELECT * FROM departments;
ROLLBACK;

-- �纻 ���̺� ����
CREATE TABLE managers AS
(
SELECT employee_id, first_name, job_id, salary, hire_date
FROM employees
WHERE 1 = 2
);

SELECT * FROM managers;

-- INSERT(��������)
INSERT INTO managers
(
SELECT employee_id, first_name, job_id, salary, hire_date
FROM employees
);

-- UPDATE
CREATE TABLE emps AS (SELECT * FROM employees);
SELECT * FROM emps;

-- CTAS�� ����ϸ� ���� ������ NOT NULL ����� ������� �ʽ��ϴ�.
-- ���������� ������Ģ�� ��Ű�� �����͸� �����ϰ�, �׷��� ���� �͵���
-- DB�� ����Ǵ� ���� �����ϴ� �������� ����մϴ�.
ALTER TABLE emps
ADD (CONSTRAINT emps_emp_id_pk PRIMARY KEY (employee_id),
     CONSTRAINT emps_manager_fk FOREIGN KEY (manager_id)
     REFERENCES emps(employee_id));

-- �������� ����
ALTER TABLE emps DROP CONSTRAINT emps_manager_fk;
ALTER TABLE emps DROP CONSTRAINT emps_emp_id_pk;

-- UPDATE�� ������ ���� ������ ������ �� �����ؾ� �մϴ�.
-- �׷��� ������ ���� ����� ���̺� ��ü�� ����˴ϴ�.
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

-- UPDATE (��������)
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

-- DELETE (��������)
DELETE FROM emps
WHERE department_id = (SELECT department_id FROM departments
                        WHERE department_id = 100);

SELECT * FROM emps;

DELETE FROM emps
WHERE department_id = (SELECT department_id FROM departments
                        WHERE department_name = 'IT');


DELETE FROM departments WHERE department_id = 50;





























/*
view�� �������� �ڷḸ ���� ���� ����ϴ� �������̺��� �����Դϴ�.
��� �⺻ ���̺�� ������ ���� ���̺��̱� ������
�ʿ��� �÷��� ������ �θ� ������ ������ ���ϴ�.
��� �������̺�� ���� �����Ͱ� ���������� ����� ���´� �ƴմϴ�.
�並 ���ؼ� �����Ϳ� �����ϸ� ���� �����ʹ� �����ϰ� ��ȣ�� �� �ֽ��ϴ�.
*/

SELECT * FROM user_sys_privs; -- ���� Ȯ��

-- �ܼ� ��
-- ���� �÷� �̸��� �Լ����� ����ǥ�����̸� �ȵ˴ϴ�.

SELECT employee_id,
       first_name || ' ' || last_name AS name,
       job_id,
       salary
FROM employees
WHERE department_id = 60;

CREATE VIEW view_emp AS (
    SELECT employee_id,
       first_name || ' ' || last_name AS name,
       job_id,
       salary
    FROM employees
    WHERE department_id = 60
);

SELECT * FROM view_emp;

-- ���� ��
-- ���� ���̺��� �����Ͽ� �ʿ��� �����͸� �����ϰ� ���� Ȯ���� ���� ���.

CREATE VIEW view_emp_dept_jobs AS (
    SELECT
        e.employee_id,
        e.first_name || ' ' || e.last_name AS name,
        d.department_name,
        j.job_title
    FROM employees e
    LEFT JOIN departments d
    ON e.department_id = d.department_id
    LEFT JOIN jobs j
    ON e.job_id = j.job_id
)
ORDER BY employee_id ASC;

SELECT * FROM view_emp_dept_jobs;

-- ���� ���� (CREATE OR REPLACE VIEW ����)
-- �����̸����� �ش� ������ ����ϸ� �����Ͱ� ����Ǹ鼭 ���Ӱ� �����˴ϴ�.
CREATE OR REPLACE VIEW view_emp_dept_jobs AS (
    SELECT
        e.employee_id,
        e.first_name || ' ' || e.last_name AS name,
        d.department_name,
        j.job_title,
        e.salary -- �߰�
    FROM employees e
    LEFT JOIN departments d
    ON e.department_id = d.department_id
    LEFT JOIN jobs j
    ON e.job_id = j.job_id
)
ORDER BY employee_id ASC;

SELECT * FROM view_emp_dept_jobs;

SELECT
    job_title,
    AVG(salary)
FROM view_emp_dept_jobs
GROUP BY job_title
ORDER BY AVG(salary) DESC;

-- �� ����
DROP VIEW view_emp;

/*
VIEW�� INSERT�� �Ͼ�� ��� ���� ���̺��� �ݿ��� �˴ϴ�.
�׷��� VIEW�� INSERT, UPDATE, DELETE�� ���� ��������� �����ϴ�.
���� ���̺��� NOT NULL�� ��� VIEW�� INSERT�� �Ұ����մϴ�.
VIEW���� ����ϴ� �÷��� ������ ��쿡�� �ȵ˴ϴ�.
*/

-- name�� ����(virtual column)�̱� ������ INSERT �ȵ˴ϴ�.
INSERT INTO view_emp_dept_jobs
VALUES(300, 'test', 'test', 'test', 10000);

-- JOIN�� ���� ��� �ѹ��� ������ �� �����ϴ�.
INSERT INTO view_emp_dept_jobs
(employee_id, department_name, job_title, salary)
VALUES(300, 'test', 'test', 'test');

-- ���� ���̺��� null�� ������� �ʴ� �÷� ������ �� �� �����ϴ�.
INSERT INTO view_emp 
(employee_id, job_id, salary)
VALUES (300, 'test', 10000);

-- WITH CHECK OPTION -> ���� ���� �÷�
-- ���ǿ� ���Ǿ��� �÷����� �並 ���ؼ� ������ �� ���� ���ִ� Ű����.
CREATE VIEW view_emp_test AS (
    SELECT
        employee_id,
        first_name,
        last_name,
        hire_date,
        job_id,
        department_id
    FROM employees
    WHERE department_id=60
)
WITH CHECK OPTION CONSTRAINT view_emp_test_ck;

UPDATE view_emp_test
SET department_id = 100
WHERE employee_id = 105; --�ȵ�

-- �б� ���� �� -> WITH READ ONLY (DML ������ ����.)
CREATE OR REPLACE VIEW view_emp_test AS (
    SELECT
        employee_id,
        first_name,
        last_name,
        hire_date,
        job_id,
        department_id
    FROM employees
    WHERE department_id=60
)
WITH READ ONLY;

INSERT INTO view_emp_test
VALUES(300, 'test', 'test', sysdate, 'IT_PROG', 100); --�ȵ�

UPDATE view_emp_test 
SET last_name = 'kim'
WHERE employee_id = 103; -- �ȵ�.


























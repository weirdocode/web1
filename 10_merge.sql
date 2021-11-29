
-- MERGE: ���̺� ����
/*
UPDATE�� INSERT�� �ѹ濡 ó��.

�� ���̺� �ش��ϴ� �����Ͱ� �ִٸ� UPDATE
������ INSERT�� ó���ض�.
���� MERGE�� �����ٸ� �ش� �������� ���� ������ ������ Ȯ���ϰ�
if���� ����ؼ� �����Ͱ� �ִٸ� UPDATE, ���ٸ� else�� ����ؼ�
INSERT�� �϶�� ������ ����ؾ� �ϴµ�, MERGE�� ���� ���� ó�� ����.
*/

CREATE TABLE emps_it AS (SELECT * FROM employees WHERE 1 = 2);
SELECT * FROM emps_it;

INSERT INTO emps_it
    (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES(105, '���̺��', '��', 'DAVIDKIM', '06/03/04', 'IT_PROG');

SELECT * FROM employees
WHERE job_id = 'IT_PROG';

MERGE INTO emps_it a -- (������ �� Ÿ�� ���̺�)
    USING -- ���ս�ų ������
        (SELECT * FROM employees WHERE job_id = 'IT_PROG') b -- ���α���
    ON -- ���ս�ų �������� ���� ����
        (a.employee_id = b.employee_id) -- ���� ����
WHEN MATCHED THEN -- ���ǿ� ��ġ�� ��� Ÿ�� ���̺� ����
    UPDATE SET
        a.phone_number = b.phone_number,
        a.hire_date = b.hire_date,
        a.salary = b.salary,
        a.commission_pct = b.commission_pct,
        a.manager_id = b.manager_id,
        a.department_id = b.department_id
    /*DELETE WHERE ~~~~ 
        DELETE�� �ܵ����� ���� �� �����ϴ�.
        UPDATE ���Ŀ� DELETE �ۼ��� �����մϴ�.
        ������ ��� �÷����� ������ ������ �ϴ� UPDATE�� �����ϰ�
        DELETE�� WHERE���� �Ʊ� ������ ������ ���� �����ؼ� �����մϴ�.
    */ 
WHEN NOT MATCHED THEN -- ���ǿ� ��ġ���� �ʴ� ��� Ÿ�����̺� ����.
    INSERT /*�Ӽ�(�÷�)*/ VALUES
        (b.employee_id, b.first_name, b.last_name,
         b.email, b.phone_number, b.hire_date, b.job_id,
         b.salary, b.commission_pct, b.manager_id, b.department_id);
         
         
-----------------------------------------------------------------------------

INSERT INTO emps_it
    (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES(102, '����', '��', 'LEXPARK', '01/04/06', 'AD_VP');
INSERT INTO emps_it
    (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES(101, '�ϳ�', '��', 'NINA', '20/04/06', 'AD_VP');
INSERT INTO emps_it
    (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES(103, '���', '��', 'HMSON', '20/04/06', 'AD_VP');

-- employees ���̺��� �Ź� �����Ǵ� ���̺��̶�� ��������.
-- ������ �����ʹ� email, phone, salary, commission, man_id, dept_id��
-- �� ������Ʈ �ϵ��� ó��
-- ���� ���Ե� �����ʹ� �״�� �߰�.

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


























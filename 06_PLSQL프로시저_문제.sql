/*
���ν����� guguProc
������ �� ���޹޾� �ش� �ܼ��� ����ϴ� procedure�� �����ϼ���. 
*/

CREATE PROCEDURE guguProc (
    p_dan IN NUMBER
)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE(p_dan || '��');
    FOR i IN 1..9
    LOOP
        DBMS_OUTPUT.PUT_LINE(p_dan || ' x ' || i || ' = ' || p_dan * i);
    END LOOP;
END;

EXEC guguProc(14);

/*
�μ���ȣ, �μ���, �۾� flag(I: insert, U:update, D:delete)�� �Ű������� �޾� 
depts ���̺� 
���� INSERT, UPDATE, DELETE �ϴ� depts_proc �� �̸��� ���ν����� ������.
�׸��� ���������� commit, ���ܶ�� �ѹ� ó���ϵ��� ó���ϼ���.
*/
CREATE TABLE depts AS SELECT department_id, department_name FROM departments;
ALTER TABLE depts ADD CONSTRAINTS depts_pk PRIMARY KEY(department_id);/*
���ν����� guguProc
������ �� ���޹޾� �ش� �ܼ��� ����ϴ� procedure�� �����ϼ���. 
*/

CREATE PROCEDURE guguProc (
    p_dan IN NUMBER
)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE(p_dan || '��');
    FOR i IN 1..9
    LOOP
        DBMS_OUTPUT.PUT_LINE(p_dan || ' x ' || i || ' = ' || p_dan * i);
    END LOOP;
END;

EXEC guguProc(14);

/*
�μ���ȣ, �μ���, �۾� flag(I: insert, U:update, D:delete)�� �Ű������� �޾� 
depts ���̺� 
���� INSERT, UPDATE, DELETE �ϴ� depts_proc �� �̸��� ���ν����� ������.
�׸��� ���������� commit, ���ܶ�� �ѹ� ó���ϵ��� ó���ϼ���.
*/
CREATE TABLE depts AS SELECT department_id, department_name FROM departments;
ALTER TABLE depts ADD CONSTRAINTS depts_pk PRIMARY KEY(department_id);

CREATE OR REPLACE PROCEDURE depts_proc(
    p_department_id IN depts.department_id%TYPE,
    p_department_name IN depts.department_name%TYPE,
    p_flag IN VARCHAR2
)
IS

BEGIN
    
    IF p_flag = 'I' THEN
        INSERT INTO depts VALUES (p_department_id, p_department_name);
    ELSIF p_flag = 'U' THEN
        UPDATE depts
        SET department_name = p_department_name
        WHERE department_id = p_department_id;
    ELSIF p_flag = 'D' THEN
        DELETE depts
        WHERE department_id = p_department_id;
    END IF;
    COMMIT;

EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('���ܰ� �߻��߽��ϴ�.');
    DBMS_OUTPUT.PUT_LINE('ERROR MSG: ' || SQLERRM);
    ROLLBACK;
END;

EXEC depts_proc(280, '�����ú�', 'D');

SELECT * FROM depts;

/*
employee_id�� �Է¹޾� employees�� �����ϸ�,
�ټӳ���� out�ϴ� ���ν����� �ۼ��ϼ���. (�͸��Ͽ��� ���ν����� ����)
���ٸ� exceptionó���ϼ���
*/
CREATE OR REPLACE PROCEDURE emp_hire_proc(
    p_employee_id IN employees.employee_id%TYPE,
    p_year OUT NUMBER
)
IS
    v_hire_date employees.hire_date%TYPE;
BEGIN
    SELECT hire_date
    INTO v_hire_date
    FROM employees
    WHERE employee_id = p_employee_id;
    
    p_year := TRUNC((sysdate - v_hire_date) / 365);
    
EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE(p_employee_id || '��(��) ���� �������Դϴ�.');
END;

DECLARE
    v_year NUMBER;
BEGIN
    emp_hire_proc(570, v_year);
    DBMS_OUTPUT.PUT_LINE(v_year);
END;




/*
���ν����� - new_emp_proc
employees ���̺��� ���� ���̺� emps�� �����մϴ�.
employee_id, last_name, email, hire_date, job_id�� �Է¹޾�
�����ϸ� �̸�, �̸���, �Ի���, ������ update, 
���ٸ� insert�ϴ� merge���� �ۼ��ϼ���
*/
SELECT * FROM emps;

CREATE OR REPLACE PROCEDURE new_emp_proc(
    p_employee_id IN emps.employee_id%TYPE,
    p_last_name IN emps.last_name%TYPE,
    p_email IN emps.email%TYPE,
    p_hire_date IN emps.hire_date%TYPE,
    p_job_id IN emps.job_id%TYPE
)
IS

BEGIN
    MERGE INTO emps a
    USING (SELECT p_employee_id AS employee_id FROM dual) b
    ON (a.employee_id = b.employee_id)
    WHEN MATCHED THEN
        UPDATE SET
            a.last_name = p_last_name,
            a.email = p_email,
            a.hire_date = p_hire_date,
            a.job_id = p_job_id
    WHEN NOT MATCHED THEN
        INSERT (a.employee_id, a.last_name, a.email, a.hire_date, a.job_id)
        VALUES (p_employee_id, p_last_name, p_email, p_hire_date, p_job_id);
END;

EXEC new_emp_proc(100, 'lee', 'abc', sysdate, 'test2');

SELECT * FROM emps;




















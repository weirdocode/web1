
-- 1. ������ �� 3���� ����ϴ� �͸� ����� ����� ���� (��¹� 9���� �����ؼ� ������.)
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

-- 2. ��� ���̺��� 201�� ����� �̸��� �̸����ּҸ� ����ϴ� �͸� ����� ����� ����
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
    

-- 3. ��� ���̺��� �����ȣ�� ���� ū ����� ã�Ƴ� ��,
-- �� ��ȣ + 1������ �Ʒ��� ����� emps��
-- employee_id, last_name, email, hire_date, job_id�� �ű� �Է��ϴ� �͸� ����� ���弼��.
-- SELECT�� ���Ŀ� INSERT�� ����� �����մϴ�.
/*
<�����>: steven
<�̸���>: stevenjobs
<�Ի�����>: ���ó�¥
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














-- lower(�ҹ���), initcap(�ձ��ڸ� �빮��), upper(�빮��)

/*
dual�̶�� ���̺��� sys�� �����ϴ� ����Ŭ�� ǥ�� ���̺�μ�
���� �� �࿡ �� �÷��� ��� �ִ� dummy ���̺��̴�.
�Ͻ����� ��� �����̳� ��¥ ���� ���� ���� �ַ� ���ȴ�.
��� ����ڰ� ������ �� �ִ�.
*/

SELECT 'abcDEF', lower('abcDEF'), upper('abcDEF')
FROM dual;

SELECT last_name, lower(last_name), initcap(last_name),
upper(last_name) FROM employees;

SELECT last_name FROM employees
WHERE lower(last_name) = 'austin';

-- length(����), instr(���� ã�� ������ 0 ����, �ε�����)
SELECT 'abcdef' AS ex, LENGTH('abcdef'), INSTR('abcdef', 'z')
FROM dual;

SELECT first_name, LENGTH(first_name), INSTR(first_name, 'a')
FROM employees;

-- substr(���ڿ� �ڸ���), concat(���� ����) 1���� ����
SELECT 'abcdef' AS ex,
SUBSTR('abcdef', 1, 4), CONCAT('abc', 'def')
FROM dual;

SELECT first_name, SUBSTR(first_name, 1, 3),
CONCAT(first_name, last_name)
FROM employees;

-- LPAD, RPAD (��, ���� �������ڿ��� ä���)
SELECT LPAD('abc', 10, '*') FROM dual;
SELECT RPAD('abc', 10, '*') FROM dual;

-- LTRIM(), RTRIM(), TRIM()��������
-- L, RTRIM -> ��/������ ������ ���� ����
SELECT LTRIM('javascript_java', 'java') FROM dual;
SELECT RTRIM('javascript_java', 'java') FROM dual;
SELECT TRIM('   java     ') FROM dual;

-- REPLACE(���ڿ� ġȯ)
SELECT REPLACE('my dream is a president', 'president', 'doctor')
FROM dual;

SELECT REPLACE('my dream is a president', ' ', '')
FROM dual;

SELECT REPLACE(REPLACE('my dream is a president', 'president', 'doctor'), ' ', '')
FROM dual;

SELECT REPLACE(CONCAT('hello ', 'world'),' ', '') FROM dual;

--�������� 1��
SELECT
    RPAD(SUBSTR(first_name, 1, 3), LENGTH(first_name), '*') AS name,
    LPAD(salary, 10, '*') as salary
FROM employees
WHERE LOWER(job_id) = 'it_prog';


-- ���� 1
SELECT CONCAT(first_name, last_name) AS �̸�,
REPLACE(hire_date, '/', '') AS �Ի�����
FROM employees
ORDER BY �̸� ASC;

-- ���� 2
SELECT 
CONCAT('(02)', SUBSTR(phone_number, 4, LENGTH(phone_number))) AS phone_number
FROM employees;















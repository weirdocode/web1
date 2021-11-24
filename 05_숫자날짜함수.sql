-- ���� �Լ�
-- ROUND(�ݿø�)
-- �Ҽ��� 1��° ��ġ �ݿø�, 0��° ��ġ �ݿø�, ���� 1��° ��ġ �ݿø�
SELECT ROUND(3.1415,2), ROUND(45.923,0), ROUND(45.923,-1)
FROM dual;

-- TRUNC(����)
-- ������ �Ҽ��� �ڸ������� �߶���ϴ�.
SELECT TRUNC(3.1415,3), TRUNC(45.923,0), TRUNC(45.923,-1)
FROM dual;

-- ABS(���밪)
SELECT ABS(-34) FROM dual;

-- CEIL(�ø�), FLOOR(����)
SELECT CEIL(3.14), FLOOR(3.14)
FROM dual;

-- mod (������)
SELECT 10 / 2, mod(10, 2)
FROM dual;

-- ��¥ �Լ�
SELECT sysdate FROM dual;
SELECT systimestamp FROM dual;

-- ��¥�� ������ �����մϴ�.
SELECT first_name, sysdate - hire_date
FROM employees;

SELECT first_name, hire_date,
(sysdate - hire_date) / 7 AS week
FROM employees; -- �ּ�

SELECT first_name, hire_date,
(sysdate - hire_date) / 365 AS week
FROM employees; -- ���

-- ��¥ �ݿø�, ����
SELECT ROUND(sysdate) FROM dual;
SELECT ROUND(sysdate, 'year') FROM dual; -- �� �������� �ݿø�
SELECT ROUND(sysdate, 'month') FROM dual; -- �� �������� �ݿø�
SELECT ROUND(sysdate, 'day') FROM dual; -- �� �������� �ݿø� (�ش� ���� �Ͽ��� ��¥)

SELECT TRUNC(sysdate) FROM dual;
SELECT TRUNC(sysdate, 'year') FROM dual;
SELECT TRUNC(sysdate, 'month') FROM dual;
SELECT TRUNC(sysdate, 'day') FROM dual; -- �� �������� ����(�ش� ���� �Ͽ��� ��¥ ����)











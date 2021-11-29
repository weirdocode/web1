
-- NUMBER(2) -> ������ 2�ڸ����� ������ �� �ִ� ������ Ÿ��
-- NUMBER(5, 2) -> ������, �Ǽ��θ� ��ģ �� �ڸ��� 5�ڸ�, �Ҽ��� 2�ڸ�
-- NUMBER -> ��ȣ�� ������ �� (38, 0)���� �ڵ� �����˴ϴ�.
-- VARCHAR2(byte) -> ��ȣ �ȿ� ���� ���ڿ��� �ִ� ���̸� ����.

CREATE TABLE dept2 (
    dept_no NUMBER(2),
    dept_name VARCHAR2(14),
    loca VARCHAR2(15),
    dept_date DATE,
    dept_bonus NUMBER(10)
);

DESC dept2;
SELECT * FROM dept2;

-- NUMBERŸ�Կ� ���� �ڸ����� Ȯ��.
INSERT INTO dept3
VALUES (10, '����', '����', sysdate, 2000000);

-- �÷� �߰�
ALTER TABLE dept2
ADD (dept_count NUMBER(3));

-- �� �̸� ����
ALTER TABLE dept2
RENAME COLUMN dept_count TO emp_count;

SELECT * FROM dept2;

-- �� �Ӽ� ����
ALTER TABLE dept2
MODIFY (emp_count NUMBER(4));

DESC dept2;

-- �� ����
ALTER TABLE dept2
DROP COLUMN emp_count;

ALTER TABLE dept2
RENAME TO dept3;

-- ���̺� ����(������ ���ܵΰ� ���� �����͸� ��� ����)
TRUNCATE TABLE dept3;

SELECT * FROM dept3;

DROP TABLE dept3;






























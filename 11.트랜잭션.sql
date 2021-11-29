
-- ����Ŀ�� Ȯ��
SHOW AUTOCOMMIT;
-- ����Ŀ�� ��
SET AUTOCOMMIT ON;
-- ����Ŀ�� ����
SET AUTOCOMMIT OFF;

SELECT * FROM emps;

INSERT INTO emps
(employee_id, last_name, email, hire_date, job_id)
VALUES (300, 'kim', 'abc@naver.com', sysdate, 1800);

-- �������� ��� ������ ��������� ���(���), ���� Ŀ�� �ܰ�� ȸ��(���ư���) Ʈ����� ����.
ROLLBACK;

DELETE FROM emps
WHERE last_name = 'kim';

-- ���̺�����Ʈ ����
-- �ѹ��� ����Ʈ�� ���� �̸��� �ٿ��� ����
-- ANSI ǥ�� ������ �ƴϱ� ������ �������� ����.
SAVEPOINT delete_kim;

ROLLBACK TO SAVEPOINT delete_kim;


INSERT INTO emps
(employee_id, last_name, email, hire_date, job_id)
VALUES (301, 'Park', 'park@naver.com', sysdate, 1800);



-- �������� ��� ������ ��������� ���������� �����ϸ鼭 Ʈ������� ����.
-- Ŀ���� ���Ŀ��� � ����� ����ϴ��� �ǵ��� �� �����ϴ�.
COMMIT;
















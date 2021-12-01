
-- ����� ���� Ȯ��
SELECT * FROM all_users;

-- ���� ���� ���
CREATE USER user1 IDENTIFIED BY user1;

-- DCL: GRANT(���� �ο�), REVOKE(���� ȸ��)
/*
CREATE USER -> �����ͺ��̽� ���� ���� ����
CREATE SESSION -> �����ͺ��̽� ���� ����
CREATE TABLE -> ���̺� ���� ����
CREATE VIEW -> �� ���� ����
CREATE SEQUENCE -> ������ ���� ����
ALTER ANY TABLE -> ��� ���̺� ������ �� �ִ� ����
INSERT ANY TABLE, SELECT ANY TABLE....

SELECT ON [table name] TO [user] -> Ư�� ���̺� ��ȸ�� �� �ִ� ����;

RESOURCE, CONNECT, DBA TO [user]
*/
GRANT CREATE SESSION TO user1;
GRANT CONNECT, RESOURCE, DBA TO user1;

ALTER USER user1 IDENTIFIED BY abc1234;

/*
���̺� �����̽��� �����ͺ��̽� ��ü �� ���� �����Ͱ� ����Ǵ� �����Դϴ�.
���̺� �����̽��� �����ϸ� ������ ��ο� ���� ���Ϸ� ������ �뷮��ŭ��
������ ������ �ǰ�, �����Ͱ� ���������� ����˴ϴ�.
���� ���̺����̽��� �뷮�� �ʰ��Ѵٸ� ���α׷��� ������������ �����մϴ�.
*/

SELECT * FROM dba_tablespaces;

-- USERS ���̺� �����̽��� �⺻ ��� �������� ����.
ALTER USER user1 DEFAULT TABLESPACE USER_TABLESPACE
QUOTA UNLIMITED ON USER_TABLESPACE;

-- ���̺� �����̽� ���� ��ü�� ��ü ����.
DROP TABLESPACE USER_TABLESPACE INCLUDING CONTENTS;

-- ������ ���ϱ��� �ѹ��� �����ϴ� ��.
DROP TABLESPACE USER_TABLESPACE INCLUDING CONTENTS AND DATAFILES;

-- ����� ���� ���� (���ӵ� ��ü�� �����Ͱ� ���� �� ���� �ȵ�.)
DROP USER user1;
-- ���� ���� �� ���̺�, ������ �� ���ӵǾ� �ִ� ��� ��ü�� �Բ� ����.
DROP USER user1 CASCADE;


















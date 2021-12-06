
/*
trigger�� ���̺� ������ ���·ν�, INSERT, UPDATE, DELETE �۾��� ����� ��
Ư�� �ڵ尡 �۵��ǵ��� �ϴ� �����Դϴ�.

Ʈ���Ŵ� ������ �� ������ �����ϰ� F5��ư���� �κн����ؾ� �մϴ�.
�׷��� ������ �ϳ��� �������� �νĵǾ� ���� �������� �ʽ��ϴ�.
*/

CREATE TABLE tbl_test(
    id NUMBER(10),
    text VARCHAR2(20)
);

CREATE OR REPLACE TRIGGER trg_test
    AFTER DELETE OR UPDATE -- ����, ���� ���Ŀ� ����
    ON tbl_test -- ������ ���̺�
    FOR EACH ROW -- �� �࿡ ����
BEGIN
    DBMS_OUTPUT.PUT_LINE('Ʈ���Ű� ������!'); -- ����Ǵ� �ڵ带 begin ~ end�� ����
END;

INSERT INTO tbl_test VALUES(1, 'ȫ�浿');
UPDATE tbl_test SET text = 'ȫ�浿2' WHERE id=1;
DELETE FROM tbl_test WHERE id=1;






















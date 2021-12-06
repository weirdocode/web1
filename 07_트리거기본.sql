
/*
trigger는 테이블에 부착한 형태로써, INSERT, UPDATE, DELETE 작업이 수행될 때
특정 코드가 작동되도록 하는 구문입니다.

트리거는 실행할 때 범위를 지정하고 F5버튼으로 부분실행해야 합니다.
그렇지 않으면 하나의 구문으로 인식되어 정상 동작하지 않습니다.
*/

CREATE TABLE tbl_test(
    id NUMBER(10),
    text VARCHAR2(20)
);

CREATE OR REPLACE TRIGGER trg_test
    AFTER DELETE OR UPDATE -- 삭제, 수정 이후에 동작
    ON tbl_test -- 부착할 테이블
    FOR EACH ROW -- 각 행에 적용
BEGIN
    DBMS_OUTPUT.PUT_LINE('트리거가 동작함!'); -- 실행되는 코드를 begin ~ end에 넣음
END;

INSERT INTO tbl_test VALUES(1, '홍길동');
UPDATE tbl_test SET text = '홍길동2' WHERE id=1;
DELETE FROM tbl_test WHERE id=1;






















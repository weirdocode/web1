/*
AFTER 트리거 - INSERT, UPDATE, DELETE 작업 이후에 동작하는 트리거를 의미합니다.
BEFORE 트리거 - INSERT, UPDATE, DELETE 작업 이전에 동작하는 트리거를 의미합니다.
INSTEAD OF 트리거 - INSERT, UPDATE, DELETE 작업 이전에 발생하는 트리거인데,
                    VIEW에만 부착할 수 있다.
                    
:OLD = 참조 전 열의 값 (INSERT: 입력 전 자료, UPDATE: 수정 전 자료, DELETE: 삭제할 값)
:NEW = 참조 후 열의 값 (INSERT: 입력 할 자료, UPDATE: 수정 된 자료)

테이블에 UPDATE나 DELETE를 시도하면 수정 또는 삭제된 데이터를
별도의 테이블에 보관해 놓는 형식으로 트리거를 사용할 수 있다.
*/

CREATE TABLE tbl_user(
    id VARCHAR2(20) PRIMARY KEY,
    name VARCHAR2(20),
    address VARCHAR2(30)
);

CREATE TABLE tbl_user_backup(
    id VARCHAR2(20),
    name VARCHAR2(20),
    address VARCHAR2(30),
    update_date DATE DEFAULT sysdate, --변경 시간
    m_type VARCHAR2(10), -- 변경 타입
    m_user VARCHAR2(20) -- 변경한 사용자
);

-- AFTER 트리거
CREATE OR REPLACE TRIGGER trg_user_backup
    AFTER UPDATE OR DELETE
    ON tbl_user
    FOR EACH ROW
DECLARE -- 사용할 변수를 선언하는 곳
    v_type VARCHAR2(10);
BEGIN
    IF UPDATING THEN -- UPDATING은 시스템 자체에서 상태에 대한 내용을 지원하는 빌트인 구문.
        v_type := '수정';
    ELSIF DELETING THEN 
        v_type := '삭제';
    END IF;
    
    -- 실행 구문 시작 (:OLD는 테이블 DELETE, UPDATE가 적용되기 전 기존 데이터. 즉 변경 전 데이터)
    INSERT INTO tbl_user_backup
    VALUES (:OLD.id, :OLD.name, :OLD.address, sysdate, v_type, USER());
    
END;

-- 확인
INSERT INTO tbl_user VALUES('test01', 'admin', '서울');
INSERT INTO tbl_user VALUES('test02', 'admin', '경기');
INSERT INTO tbl_user VALUES('test03', 'admin', '부산');

SELECT * FROM tbl_user;
SELECT * FROM tbl_user_backup;

UPDATE tbl_user SET address='인천' WHERE id='test01';

-- BEFORE 트리거
CREATE OR REPLACE TRIGGER trg_user_insert
    BEFORE INSERT
    ON tbl_user
    FOR EACH ROW
BEGIN
    :NEW.name := SUBSTR(:NEW.name, 1, 1) || '**';
END;

INSERT INTO tbl_user VALUES('test04', '홍길동', '대구');

SELECT * FROM tbl_user;

















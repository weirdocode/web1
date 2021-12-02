
/*
# PL/SQL 이란
- 오라클에서 제공하는 SQL 프로그래밍 기능이다.
- 일반적은 프로그래밍과는 차이가 있지만, 오라클 내부에서 적절한 처리를 위해서
 적용해 줄 수 있는 절차지향적 코드 작성 방식입니다.
- 쿼리문의 집합으로 어떠한 동작을 일괄처리하기 위한 용도로 사용합니다.
*/

SET SERVEROUTPUT ON; -- 출력문 활성화

DECLARE -- 변수를 선언하는 구간(선언부).
    emp_num NUMBER; -- 변수 선언.
BEGIN -- 코드를 실행하는 시작 구간(실행부).
    emp_num := 10; -- 대입연산자 :=
    dbms_output.put_line(emp_num); -- 출력문
    dbms_output.put_line('hello pl/sql!!!');
END; -- PL/SQL이 끝나는 구간(종료).

-- 연산자
-- 일반 SQL문의 모든 연산자의 사용이 가능하고,
-- **는 제곱을 의미합니다.
DECLARE
    A NUMBER := 2**2*3**2;
BEGIN
    DBMS_OUTPUT.PUT_LINE('a = ' || TO_CHAR(A));
END;
















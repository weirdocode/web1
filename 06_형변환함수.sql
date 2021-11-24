
-- 형 변환함수 TO_CHAR, TO_NUMBER, TO_DATE

-- 날짜를 문자로 TO_CHAR(값, 형식)
SELECT TO_CHAR(sysdate) FROM dual;
SELECT TO_CHAR(sysdate, 'YYYY-MM-DD HH:MI:SS') FROM dual;
SELECT TO_CHAR(sysdate, 'YY-MM-DD HH24:MI:ss') FROM dual;

-- 사용하고 싶은 문자를 ""를 묶어 전달합니다.
SELECT first_name, TO_CHAR(hire_date, 'YYYY"년" MM"월" DD"일"')
FROM employees;

-- 숫자를 문자로 TO_CHAR(값, 형식)
SELECT TO_CHAR(20000, '99999') FROM dual;
-- 주어진 자릿수에 숫자를 모두 표기할 수 없어서 모두 #으로 표기됩니다.
SELECT TO_CHAR(20000, '9999') FROM dual;
SELECT TO_CHAR(20000.21, '99999.99') FROM dual; -- 소수점 자리수 지정 가능.
SELECT TO_CHAR(20000, '99,999') FROM dual;

SELECT TO_CHAR(salary, 'L099,999') AS salary
FROM employees;

















-- 그룹 함수 AVG, MAX, MIN, SUM, COUNT
SELECT
    AVG(salary),
    MAX(salary),
    MIN(salary),
    SUM(salary),
    COUNT(*)
FROM employees;

SELECT COUNT(*) FROM employees; -- 총 행 데이터의 수
SELECT COUNT(first_name) FROM employees;
SELECT COUNT(commission_pct) FROM employees; -- null이 아닌 행의 수
SELECT COUNT(manager_id) FROM employees; -- null이 아닌 행의 수

-- 부서별로 그룹화, 그룹함수의 사용
SELECT
    department_id,
    AVG(salary)
FROM employees
GROUP BY department_id;

-- 주의할 점
-- 그룹함수는 일반 컬럼과 동시에 출력할 수 없습니다.
SELECT
    department_id,
    AVG(salary)
FROM employees; -- 에러

-- GROUP BY절을 사용할 때 GROUP절에 묶이지 않으면 다른 컬럼을 조회할 수 없습니다.
SELECT
    job_id,
    department_id,
    AVG(salary)
FROM employees
GROUP BY department_id; -- 에러

-- GROUP BY절 2개 이상 사용
SELECT
    job_id,
    department_id
FROM employees
GROUP BY department_id, job_id
ORDER BY department_id;

-- GROUP BY 절의 조건 HAVING절
SELECT
    department_id,
    SUM(salary)
FROM employees
GROUP BY department_id
HAVING SUM(salary) > 100000;

SELECT
    job_id, 
    COUNT(*)
FROM employees
GROUP BY job_id
HAVING COUNT(*) >= 20;

-- 부서아이디가 50이상인 것들을 그룹화 시키고, 그룹 월급 평균 중 5000 이상만 조회
SELECT
    department_id,
    AVG(salary) AS 평균
FROM employees
WHERE department_id >= 50
GROUP BY department_id
HAVING AVG(salary) >= 5000;

-- 문제 1
SELECT job_id, COUNT(*) AS 사원수 FROM employees GROUP BY job_id;
SELECT job_id, AVG(salary) AS 평균월급 
FROM employees GROUP BY job_id ORDER BY AVG(salary) DESC;

-- 문제 2
SELECT TO_CHAR(hire_date, 'YY'), COUNT(*)
FROM employees
GROUP BY TO_CHAR(hire_date, 'YY');

-- 문제 3
SELECT department_id, AVG(salary)
FROM employees
WHERE salary >= 8000
GROUP by department_id
HAVING AVG(salary) >= 5000;

-- 문제 4
SELECT
    department_id,
    TRUNC(AVG(salary + salary*commission_pct), 2) AS 평균,
    SUM(salary + salary*commission_pct) AS 합계,
    COUNT(*)
FROM employees
WHERE commission_pct IS NOT NULL
GROUP BY department_id;




















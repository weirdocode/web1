
-- 문제 1
SELECT * FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

SELECT COUNT(*) FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

SELECT * FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees
                WHERE job_id='IT_PROG');
                
-- 문제 2
SELECT * FROM employees
WHERE department_id = (SELECT department_id
                        FROM departments
                        WHERE manager_id=100);
                        
-- 문제3
SELECT * FROM employees
WHERE manager_id >
    (SELECT manager_id FROM employees
    WHERE first_name = 'Pat');

SELECT * FROM employees
WHERE manager_id IN
    (
    SELECT manager_id FROM employees
    WHERE first_name = 'James'
    );

-- 문제 4
SELECT * FROM
    (
    SELECT ROWNUM AS rn, first_name FROM
        (
        SELECT * FROM employees
        ORDER BY first_name DESC
        )
    )
WHERE rn > 40 AND rn <= 50;

-- 문제 5
SELECT * FROM
    (
    SELECT ROWNUM AS rn, tbl.* FROM
        (
        SELECT employee_id, first_name, phone_number, hire_date FROM employees
        ORDER BY hire_date ASC
        ) tbl
    )
WHERE rn > 30 AND rn <= 40;

--문제 6
SELECT 
    e.employee_id,
    CONCAT(first_name, last_name) AS 이름,
    e.department_id,
    d.department_name
FROM employees e LEFT JOIN departments d
ON e.department_id = d.department_id
ORDER BY employee_id ASC;

-- 문제 7
SELECT 
    e.employee_id,
    CONCAT(first_name, last_name) AS 이름,
    e.department_id,
    (
    SELECT department_name FROM departments d
    WHERE d.department_id = e.department_id
    ) AS department_name
FROM employees e
ORDER BY employee_id ASC;

-- 문제 8
SELECT
    d.department_id,
    d.department_name,
    d.manager_id,
    d.location_id,
    loc.street_address,
    loc.postal_code,
    loc.city
FROM departments d LEFT JOIN locations loc
ON d.location_id = loc.location_id
ORDER BY department_id ASC;

-- 문제 9
-- 스칼라 서브쿼리는 반드시 한 행, 한 컬럼만 리턴하는 서브쿼리입니다.
SELECT
    d.department_id,
    d.department_name,
    d.manager_id,
    d.location_id,
    (
    SELECT
        loc.street_address
    FROM locations loc
    WHERE loc.location_id = d.location_id
    ) AS street_address,
    (
    SELECT
        loc.postal_code
    FROM locations loc
    WHERE loc.location_id = d.location_id
    ) AS postal_code,
    (
    SELECT
        loc.city
    FROM locations loc
    WHERE loc.location_id = d.location_id
    ) AS city
FROM departments d
ORDER BY department_id ASC;

-- 문제 10
SELECT
    loc.location_id,
    loc.street_address,
    loc.city,
    c.country_id,
    c.country_name
FROM locations loc LEFT JOIN countries c
ON loc.country_id = c.country_id
ORDER BY c.country_name ASC;

-- 문제 11
SELECT
    loc.location_id,
    loc.street_address,
    loc.city,
    (
    SELECT country_id FROM countries c
    WHERE c.country_id = loc.country_id
    ) AS country_id,
    (
    SELECT country_name FROM countries c
    WHERE c.country_id = loc.country_id
    ) AS country_name
FROM locations loc
ORDER BY country_name ASC;
















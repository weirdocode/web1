
-- 문제 1
SELECT *
    FROM employees e
    INNER JOIN departments d
    ON e.department_id = d.department_id; -- 106개
    
SELECT *
    FROM employees e
    LEFT OUTER JOIN departments d
    ON e.department_id = d.department_id; -- 107개
    
SELECT *
    FROM employees e
    RIGHT OUTER JOIN departments d
    ON e.department_id = d.department_id; -- 122개

SELECT *
    FROM employees e
    FULL OUTER JOIN departments d
    ON e.department_id = d.department_id; -- 123개
    
-- 문제 2
SELECT 
    e.first_name || ' ' || e.last_name AS name,
    d.department_id
FROM employees e
INNER JOIN departments d
ON e.department_id = d.department_id
WHERE e.employee_id = 200;

-- 문제 3
SELECT
    e.first_name, e.job_id, j.job_title
FROM employees e
INNER JOIN jobs j
ON e.job_id = j.job_id
ORDER BY e.first_name ASC;

-- 문제 4
SELECT *
FROM jobs j
LEFT OUTER JOIN job_history jh
ON jh.job_id = j.job_id;

-- 문제 5
SELECT
    first_name || ' ' || last_name,
    d.department_name
FROM employees e
LEFT JOIN departments d
ON e.department_id = d.department_id
WHERE e.first_name = 'Steven'
AND e.last_name = 'King';

-- 문제 6
SELECT *
FROM employees e
CROSS JOIN departments d;


















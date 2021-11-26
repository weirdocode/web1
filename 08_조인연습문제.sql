
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

-- 문제 7
SELECT
    e.employee_id, e.first_name, e.salary,
    d.department_name, loc.city
FROM employees e
JOIN departments d
ON e.department_id = d.department_id
JOIN locations loc
ON d.location_id = loc.location_id
WHERE e.job_id = 'SA_MAN';

-- 문제 8
SELECT
    e.employee_id, e.first_name, j.job_title
FROM employees e
JOIN jobs j
ON e.job_id = j.job_id
WHERE job_title IN ('Stock Manager', 'Stock Clerk');

-- 문제 9
SELECT
    d.department_name
FROM departments d
LEFT OUTER JOIN employees e
ON d.department_id = e.department_id
WHERE e.employee_id IS NULL;

-- 문제 10 (SELF JOIN)
SELECT 
    e1.first_name, e2.first_name AS manager_name
FROM employees e1
LEFT JOIN employees e2
ON e1.manager_id = e2.employee_id;

-- 문제 11
SELECT
    e1.employee_id, e1.first_name, e1.manager_id,
    e2.first_name, e2.job_id, e2.salary
FROM employees e1
LEFT JOIN employees e2
ON e1.manager_id = e2.employee_id
WHERE e1.manager_id IS NOT NULL
ORDER BY e1.salary DESC;



























-- Write your query below
SELECT 
    employee_id,
    CASE 
        WHEN employee_id % 2 <> 0 AND NOT STARTS_WITH(name, 'M') THEN salary
        ELSE 0
    END AS bonus
FROM 
    employees
ORDER BY 
    employee_id;
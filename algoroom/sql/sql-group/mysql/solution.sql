select department, count(department) as "employee_count", round(avg(salary), 1) as "avg_salary"
from employees
group by department
having employee_count >= 2
order by department asc;
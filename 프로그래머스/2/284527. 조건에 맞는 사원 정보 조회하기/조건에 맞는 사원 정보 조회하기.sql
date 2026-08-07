select sum(g.score) as "SCORE", e.emp_no, e.emp_name, e.position, e.email
from hr_employees e join hr_grade g
on e.emp_no = g.emp_no
group by e.emp_no, e.emp_name, e.position, e.email
order by score desc
limit 1;
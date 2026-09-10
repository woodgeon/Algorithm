select sum(g.score) as "SCORE", e.emp_no, e.emp_name, e.position, e.email
from HR_EMPLOYEES e join HR_GRADE g
on e.EMP_NO = g.EMP_NO
group by e.emp_no, e.emp_name, e.position, e.email
order by SCORE desc
limit 1;
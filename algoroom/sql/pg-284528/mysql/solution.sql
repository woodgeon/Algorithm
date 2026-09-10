select e.emp_no as "EMP_NO", e.emp_name as "EMP_NAME",
    case
        when avg(g.score) >= 96 then 'S'
        when avg(g.score) >= 90 then 'A'
        when avg(g.score) >= 80 then 'B'
        else 'C'
    end as "GRADE",
    case
        when avg(g.score) >= 96 then e.sal * 0.2
        when avg(g.score) >= 90 then e.sal * 0.15
        when avg(g.score) >= 80 then e.sal * 0.1
        else 0
    end as "BONUS"
from HR_EMPLOYEES e join HR_GRADE g
on e.EMP_NO = g.EMP_NO
group by e.emp_no, e.emp_name, e.sal
order by e.emp_no asc;
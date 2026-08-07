select d.dept_id as "DEPT_ID", d.dept_name_en as "DEPT_NAME_EN", round(avg(e.sal)) as "AVG_SAL"
from hr_department d join hr_employees e
on d.dept_id = e.dept_id
group by d.dept_id, d.dept_name_en
order by AVG_SAL desc;

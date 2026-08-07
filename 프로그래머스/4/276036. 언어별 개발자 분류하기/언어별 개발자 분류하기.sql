with skills as (
    select
    (select sum(code) from skillcodes where category = 'Front End') as "front_end",
    (select code from skillcodes where name = 'C#') as "c_sharp",
    (select code from skillcodes where name = 'Python') as "python"
)
select
    case 
        when (skill_code & front_end) and (skill_code & python) then 'A'
        when (skill_code & c_sharp) then 'B'
        when (skill_code & front_end) then 'C'
    end as "GRADE",
    id,
    email
from developers, skills
having grade is not null
order by grade asc, id asc;
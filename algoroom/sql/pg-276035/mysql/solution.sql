select id, email, first_name, last_name
from DEVELOPERS
where SKILL_CODE & (
    select sum(CODE)
    from SKILLCODES
    where category = 'Front End'
) > 0
order by id asc;
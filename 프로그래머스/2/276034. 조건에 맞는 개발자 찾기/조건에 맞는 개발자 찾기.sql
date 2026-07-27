select id, email, first_name, last_name
from developers
where exists (
    select 1
    from skillcodes
    where name in ('Python', 'C#')
        and (developers.skill_code & code) > 0
)
order by id asc;
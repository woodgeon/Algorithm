select name
from (
    select *
    from animal_ins
    order by datetime asc
)
where rownum = 1;
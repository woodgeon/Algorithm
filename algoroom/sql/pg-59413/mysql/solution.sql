with recursive cte as (
    select 0 as HOUR
    union all
    select HOUR + 1
    from cte
    where hour < 23
)

select c.HOUR, count(o.animal_id) as COUNT
from cte c left join animal_outs o
on c.HOUR = hour(o.DATETIME)
group by c.HOUR
order by c.HOUR asc;
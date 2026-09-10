with recursive cte as (
    select 0 as "HOUR"
    union all
    select hour + 1 from cte where hour < 23
)

select c.hour as "HOUR", ifnull(count(ANIMAL_ID), 0) as "COUNT"
from cte c left join animal_outs a
on c.hour = hour(a.datetime)
group by hour
order by hour asc;
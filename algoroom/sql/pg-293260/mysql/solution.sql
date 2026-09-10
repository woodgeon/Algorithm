with recursive cte as (
    select 1 as "month"
    union all
    select month + 1 from cte where month < 12
)

select count(*) as "FISH_COUNT", month(i.time) as "MONTH"
from fish_info i join cte c
on month(i.time) = c.month
group by month(i.time)
order by MONTH asc;
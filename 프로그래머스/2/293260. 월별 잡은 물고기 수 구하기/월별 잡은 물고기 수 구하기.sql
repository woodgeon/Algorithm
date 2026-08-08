select count(*), month(time)
from fish_info
group by month(time)
order by month(time) asc;
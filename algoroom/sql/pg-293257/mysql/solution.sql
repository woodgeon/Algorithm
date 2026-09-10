select count(*) as "FISH_COUNT", n.fish_name as "FISH_NAME"
from FISH_INFO i join FISH_NAME_INFO n
on i.FISH_TYPE = n.FISH_TYPE
group by n.fish_name
order by count(*) desc;
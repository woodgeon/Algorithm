select i.ID, n.FISH_NAME, i.LENGTH
from FISH_INFO i join FISH_NAME_INFO n
on i.FISH_TYPE = n.FISH_TYPE
where i.length = (
    select max(sub.length)
    from fish_info sub
    where i.fish_type = sub.fish_type
)
order by id asc;
select i.id, n.fish_name, i.length
from fish_info i join fish_name_info n
on i.fish_type = n.fish_type
where i.length = (
    select max(sub.length)
    from fish_info sub
    where sub.fish_type = i.fish_type
)
order by i.id asc;
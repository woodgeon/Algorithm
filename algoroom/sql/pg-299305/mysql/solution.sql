select e.id as "ID", (
    select count(*) 
    from ecoli_data sub 
    where sub.parent_id = e.id
) as "CHILD_COUNT"
from ecoli_data e
order by e.id asc;
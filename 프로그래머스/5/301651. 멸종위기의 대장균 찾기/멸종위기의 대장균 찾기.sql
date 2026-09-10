with recursive family as (
    select id, 1 as generation
    from ecoli_data
    where parent_id is null
    
    union all
    
    select child.id, parent.generation + 1
    from ecoli_data child join family parent
    on child.parent_id = parent.id
)

select count(f.id), f.generation
from family f
where not exists (
    select e.id
    from ecoli_data e
    where e.parent_id = f.id
)
group by f.generation
order by f.generation asc;
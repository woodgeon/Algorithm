with recursive family as (
    select id, 1 as generation
    from ecoli_data
    where parent_id is null

    union all
    
    select child.id, parent.generation + 1
    from ecoli_data child join family parent
    where child.parent_id = parent.id
)

select count(f.id) as "COUNT", generation as "GENERATION"
from family f
where not exists (
    select id
    from ecoli_data e
    where f.id = e.parent_id
)
group by f.generation
order by generation asc;
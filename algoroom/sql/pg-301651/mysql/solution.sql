with recursive family as (
    select id, 1 as generation
    from ecoli_data
    where parent_id is null

    union all

    select child.id, generation + 1
    from ecoli_data child join family parent
    on child.parent_id = parent.id
)

select count(*) as COUNT, f.generation as GENERATION
from family f
where not exists (
    select 1
    from ecoli_data e
    where f.id = e.parent_id
)
group by f.generation
order by GENERATION asc;
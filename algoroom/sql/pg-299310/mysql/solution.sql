with yearly_max as (
    select year(differentiation_date) as "YEAR", max(SIZE_OF_COLONY) as "MAX_SIZE"
    from ecoli_data
    group by year(differentiation_date)
)

select year(e.DIFFERENTIATION_DATE) as "YEAR", (MAX_SIZE - e.SIZE_OF_COLONY) as "YEAR_DEV", e.id
from ecoli_data e join yearly_max y
on year(e.DIFFERENTIATION_DATE) = YEAR
order by YEAR asc, YEAR_DEV asc;


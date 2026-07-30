select year(DIFFERENTIATION_DATE) as "YEAR", m.MAX_SIZE - e.size_of_colony as "YEAR_DEV", id
from ecoli_data e inner join (
    select year(DIFFERENTIATION_DATE) as "MAX_YEAR", max(SIZE_OF_COLONY) as "MAX_SIZE"
    from ecoli_data
    group by year(DIFFERENTIATION_DATE)
) m
on year(DIFFERENTIATION_DATE) = m.MAX_YEAR
order by YEAR asc, YEAR_DEV asc;
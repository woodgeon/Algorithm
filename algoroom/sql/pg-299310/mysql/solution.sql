select year(e.DIFFERENTIATION_DATE) as YEAR, m.MAX - e.size_of_colony as "YEAR_DEV", e.id
from ecoli_data e join (
    select year(DIFFERENTIATION_DATE) as YEAR, max(size_of_colony) as MAX
    from ecoli_data
    group by year(DIFFERENTIATION_DATE)
) m
on year(e.DIFFERENTIATION_DATE) = m.YEAR
order by YEAR asc, YEAR_DEV asc;
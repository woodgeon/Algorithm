select b.CATEGORY as "CATEGORY", sum(s.sales) as "TOTAL_SALES"
from BOOK b join BOOK_SALES s
on b.book_id = s.book_id
where SALES_DATE between date '2022-01-01' and date '2022-01-31'
group by b.CATEGORY
order by b.CATEGORY asc;
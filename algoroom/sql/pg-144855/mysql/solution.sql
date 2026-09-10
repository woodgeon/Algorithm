select b.category as "CATEGORY", sum(s.sales) as "TOTAL_SALES"
from book b join book_sales s
on b.book_id = s.book_id
where SALES_DATE between date '2022-01-01' and date '2022-01-31'
group by b.category
order by b.category asc;
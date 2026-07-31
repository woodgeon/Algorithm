select b.author_id as "AUTHOR_ID", a.author_name as "AUTHOR_NAME", b.category as "CATEGORY",
    sum(b.price * s.sales) as "TOTAL_SALES"
from book b 
    join author a on b.author_id = a.author_id
    join book_sales s on b.book_id = s.book_id
where s.sales_date between date '2022-01-01' and date '2022-01-31'
group by b.author_id, a.author_name, b.category
order by AUTHOR_ID asc, CATEGORY desc;
select a.author_id, a.author_name, b.category, sum((b.price * s.sales)) as "TOTAL_SALES"
from book b join book_sales s on b.book_id = s.book_id
    join author a on b.author_id = a.author_id
where SALES_DATE like '2022-01%'
group by a.author_id, a.author_name, b.category
order by a.author_id asc, b.category desc;

select a.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY, sum(b.price * s.COUNT) as TOTAL_SALES
from book b join AUTHOR a on b.AUTHOR_ID = a.AUTHOR_ID
    join (
        select book_id, SALES_DATE, sum(sales) as "COUNT"
        from BOOK_SALES 
        group by book_id, SALES_DATE
) s on b.BOOK_ID = s.BOOK_ID
where s.SALES_DATE like '2022-01%'
group by a.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY
order by a.AUTHOR_ID asc, b.CATEGORY desc;
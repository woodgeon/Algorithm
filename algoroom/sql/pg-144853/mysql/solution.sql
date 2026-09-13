select BOOK_ID, PUBLISHED_DATE
from book
where year(PUBLISHED_DATE) = 2021
    and CATEGORY = '인문'
order by PUBLISHED_DATE asc;
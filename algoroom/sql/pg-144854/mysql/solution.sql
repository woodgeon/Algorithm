select b.BOOK_ID, a.AUTHOR_NAME, b.PUBLISHED_DATE
from book b join AUTHOR a
on b.AUTHOR_ID = a.AUTHOR_ID
where CATEGORY = '경제'
order by b.PUBLISHED_DATE;
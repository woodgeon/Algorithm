select u.user_id, u.nickname, sum(b.price) as "TOTAL_SALES"
from USED_GOODS_BOARD b join USED_GOODS_USER u
on b.WRITER_ID = u.USER_ID
where status = 'DONE'
group by u.user_id, u.nickname
having sum(b.price) >= 700000
order by TOTAL_SALES asc;

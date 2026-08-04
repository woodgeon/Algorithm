select u.user_id as "USER_ID", u.nickname as "NICKNAME", sum(b.price) as "TOTAL_SALES"
from USED_GOODS_BOARD b join USED_GOODS_USER u
on b.WRITER_ID = u.user_id
where b.status = 'DONE'
group by u.user_id, u.nickname
having sum(b.price) >= 700000
order by sum(b.price) asc;
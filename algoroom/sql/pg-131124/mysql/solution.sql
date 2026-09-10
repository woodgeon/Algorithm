with cte as (
    select MEMBER_ID, REVIEW_TEXT, REVIEW_DATE, count(*)
    from REST_REVIEW
    group by MEMBER_ID, REVIEW_TEXT, REVIEW_DATE
    order by count(*) desc
    limit 1
)

select m.MEMBER_NAME, r.REVIEW_TEXT, r.REVIEW_DATE
from REST_REVIEW r join MEMBER_PROFILE m
on r.MEMBER_ID = m.MEMBER_ID
order by r.REVIEW_DATE asc, r.REVIEW_TEXT asc;
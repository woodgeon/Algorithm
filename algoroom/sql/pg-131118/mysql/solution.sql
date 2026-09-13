select i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS, r.SCORE
from REST_INFO i join (
    select REST_ID, round(avg(REVIEW_SCORE), 2) as "SCORE"
    from REST_REVIEW
    group by REST_ID
) r
on i.REST_ID = r.REST_ID
where i.ADDRESS like '서울%'
order by r.SCORE desc, i.FAVORITES desc;
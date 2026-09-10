select mcdp_cd as "진료과코드", count(*) as "5월예약건수"
from appointment
where apnt_ymd between date '2022-05-01' and date '2022-05-30'
    and apnt_cncl_yn = 'N'
group by mcdp_cd
order by 5월예약건수 asc, mcdp_cd asc;
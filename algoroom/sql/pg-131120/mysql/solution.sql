select MEMBER_ID, MEMBER_NAME, GENDER, DATE_OF_BIRTH
from MEMBER_PROFILE
where GENDER = 'W'
    and TLNO is not null
    and month(DATE_OF_BIRTH) = 3
order by MEMBER_ID asc;
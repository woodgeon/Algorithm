select id, email, first_name, last_name 
from developers
where skill_code & 256 != 0
    or skill_code & 1024 != 0
order by id asc, EMAIL asc, FIRST_NAME asc, LAST_NAME asc;

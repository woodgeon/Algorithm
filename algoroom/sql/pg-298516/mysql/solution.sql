select count(ifnull(length, 0)) as "FISH_COUNT"
from fish_info
where year(time) = 2021;
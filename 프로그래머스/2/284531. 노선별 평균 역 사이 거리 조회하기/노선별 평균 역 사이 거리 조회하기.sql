select route, concat(round(sum(d_between_dist), 2), 'km') as "TOTAL_DISTANCE", concat(round(sum(d_between_dist) / count(*), 2), 'km') as "AVERAGE_DISTANCE"
from subway_distance
group by route
order by round(sum(d_between_dist), 2) desc;

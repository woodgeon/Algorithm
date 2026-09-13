select count(*) as "COUNT"
from ecoli_data
where GENOTYPE & 2 = 0
    and (GENOTYPE & 1 > 0 or GENOTYPE & 4 > 0);
-- 2번 형질을 보유하지 않는다. &(and 연산으로 0이 나온다는 건, 일치하는 비트 없음.)
-- 1번이나 3번 형질을 보유한다. &(and 연산으로 0보다 큰 건, 일치하는 비트 있음.)
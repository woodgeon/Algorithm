select child.id as ID, child.genotype as GENOTYPE, parent.genotype as PARENT_GENOTYPE
from ecoli_data parent join ecoli_data child
on parent.id = child.parent_id
-- 부모의 형질을 모두 가지려면, 부모와 and 연산했을 때, 부모 비트만큼 나오면 다 가지고있는거
where child.genotype & parent.genotype = parent.genotype
order by child.id asc;
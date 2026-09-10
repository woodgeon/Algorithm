select a.id, a.genotype, b.genotype as "PARENT_GENOTYPE"
from ecoli_data a join ecoli_data b
on a.parent_id = b.id
where a.genotype & b.genotype = b.genotype
order by id asc; 
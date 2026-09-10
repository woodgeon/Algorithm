select b.id, b.genotype, a.genotype as "PARENT_GENOTYPE"
from ecoli_data a join ecoli_data b
on a.id = b.parent_id
where a.genotype & b.genotype = a.genotype
order by b.id asc;
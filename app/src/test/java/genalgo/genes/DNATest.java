package genalgo.genes;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class DNATest {

    @Test
    public void genes_should_be_able_to_be_created() {
        DNA dna = new DNA();
        int id1 = 1;
        int id2 = 2;
        Gene gene = GenesFactory.getRandomSingleValueGene(id1);
        Gene gene2 = GenesFactory.getRandomSingleValueGene(id2);
        dna.addGene(gene);
        dna.addGene(gene2);
        assertThat(dna.getGene(id1)).isEqualTo(gene);
        assertThat(dna.getGene(id2)).isEqualTo(gene2);
    }
}

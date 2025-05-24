package genalgo;

import genalgo.genes.DNA;
import genalgo.genes.Gene;
import genalgo.genes.GenesFactory;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DNATest {

    @Test
    public void genes_should_be_able_to_be_created() {
        DNA dna = new DNA();
        Gene gene = GenesFactory.getRandomGene();
        dna.addGene(gene);
        assertThat(dna.getGene(gene.getId())).isNotNull();
    }
}

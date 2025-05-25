package genalgo.lifecycle.crossover;

import genalgo.genes.GenesFactory;
import genalgo.lifecycle.Individual;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NaiveCrossoverTest {
    @Test
    public void crossover_should_be_able_to_create_new_individuals() {
        Crossover crossover = new NaiveCrossover();
        Individual parent1 = new Individual();
        Individual parent2 = new Individual();
        Individual crossover1 = crossover.crossover(parent1, parent2);
        assertThat(crossover1).isNotNull().isNotEqualTo(parent1).isNotEqualTo(parent2);
    }

    @Test
    public void crossover_should_keep_genes_from_parents() {
        Crossover crossover = new NaiveCrossover();
        Individual parent1 = new Individual();
        Individual parent2 = new Individual();
        parent1.getDna().addGene(GenesFactory.getRandomSingleValueGene(1));
        parent2.getDna().addGene(GenesFactory.getRandomSingleValueGene(1));

        Individual crossover1 = crossover.crossover(parent1, parent2);

        assertThat(crossover1.getDna().getGenes().get(1))
                .isIn(parent1.getDna().getGenes().get(1), parent2.getDna().getGenes().get(1));
    }
}

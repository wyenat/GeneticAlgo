package genalgo.lifecycle.mutation;

import genalgo.genes.DNA;
import genalgo.lifecycle.Individual;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NaiveMutationTest {
    @Test
    public void should_be_able_to_mutate_individuals() {
        // This is a rather placeholdery-test, as the mutation is not supposed to be deterministic
        Mutation mutation = new NaiveMutation();
        Individual individual = new Individual();
        DNA dna = individual.getDna();
        mutation.mutate(individual);
        assertThat(dna).isNotEqualTo(individual.getDna());
    }
}

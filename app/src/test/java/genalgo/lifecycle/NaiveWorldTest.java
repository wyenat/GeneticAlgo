package genalgo.lifecycle;

import genalgo.NaiveWorld;
import genalgo.lifecycle.fitness.FitnessCalculator;
import genalgo.lifecycle.fitness.NaiveFitnessCalculator;
import org.junit.Test;

import java.util.Comparator;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class NaiveWorldTest {

    @Test
    public void should_create_world_with_initial_population() {
        World world = new NaiveWorld(10);
        assertThat(world.getIndividuals()).hasSize(10);
    }

    @Test
    public void should_return_individuals_sorted_by_fitness() {
        World world = new NaiveWorld(10);
        FitnessCalculator fitnessCalculator = new NaiveFitnessCalculator();
        world.getIndividuals();
        assertThat(world.getIndividuals()).isSortedAccordingTo(Comparator.comparingDouble(fitnessCalculator::calculateFitness));
    }
}

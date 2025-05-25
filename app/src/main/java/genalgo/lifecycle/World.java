package genalgo.lifecycle;

import genalgo.lifecycle.fitness.FitnessCalculator;

import java.util.ArrayList;
import java.util.List;

public abstract class World {
    private final List<Individual> individuals;
    protected FitnessCalculator fitnessCalculator;

    public World(int popSize) {
        this.individuals = new ArrayList<>(popSize);
        for (int i = 0; i < popSize; i++) {
            individuals.add(new Individual());
        }
    }

    private void sortIndividuals() {
        individuals.sort((a, b) -> {
            // Assuming Individual has a method to get fitness
            return Double.compare(fitnessCalculator.calculateFitness(a), fitnessCalculator.calculateFitness(b));
        });
    }

    public List<Individual> getIndividuals() {
        sortIndividuals();
        return individuals;
    }
}

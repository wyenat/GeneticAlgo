package genalgo.lifecycle.fitness;

import genalgo.lifecycle.Individual;

import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class NaiveFitnessCalculator implements FitnessCalculator {

    @Override
    public double calculateFitness(Individual individual) {
        // Simply select by Gene ID
        return individual.getDna()
                .getGenes()
                .keySet()
                .stream()
                .mapToDouble(Integer::toUnsignedLong)
                .sum();
    }
}

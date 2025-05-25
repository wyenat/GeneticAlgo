package genalgo.lifecycle.fitness;

import genalgo.lifecycle.Individual;

@FunctionalInterface
public interface FitnessCalculator {
    public abstract double calculateFitness(Individual individual);
}

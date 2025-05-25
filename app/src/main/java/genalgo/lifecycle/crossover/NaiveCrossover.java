package genalgo.lifecycle.crossover;

import genalgo.lifecycle.Individual;

public class NaiveCrossover implements Crossover{
    @Override
    public Individual crossover(Individual parent1, Individual parent2) {
        return new Individual();
    }
}

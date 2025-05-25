package genalgo.lifecycle.crossover;

import genalgo.lifecycle.Individual;

@FunctionalInterface
public interface Crossover {

    public abstract Individual crossover(Individual parent1, Individual parent2);
}

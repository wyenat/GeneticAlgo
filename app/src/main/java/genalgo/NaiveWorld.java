package genalgo;

import genalgo.lifecycle.World;
import genalgo.lifecycle.fitness.NaiveFitnessCalculator;

public class NaiveWorld extends World {
    public NaiveWorld(int popSize) {
        super(popSize);
        this.fitnessCalculator = new NaiveFitnessCalculator();
    }
}

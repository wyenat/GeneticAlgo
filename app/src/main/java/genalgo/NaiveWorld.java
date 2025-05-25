package genalgo;

import genalgo.lifecycle.World;
import genalgo.lifecycle.crossover.NaiveCrossover;
import genalgo.lifecycle.fitness.NaiveFitnessCalculator;
import genalgo.lifecycle.mutation.NaiveMutation;
import genalgo.lifecycle.selection.NaiveSelection;

public class NaiveWorld extends World {
    public NaiveWorld(int popSize) {
        super(popSize, new NaiveSelection(popSize/2), new NaiveCrossover(), new NaiveMutation());
        this.fitnessCalculator = new NaiveFitnessCalculator();
    }
}

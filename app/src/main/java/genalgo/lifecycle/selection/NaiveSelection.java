package genalgo.lifecycle.selection;

import genalgo.lifecycle.World;
import genalgo.lifecycle.fitness.FitnessCalculator;
import genalgo.lifecycle.fitness.NaiveFitnessCalculator;

public class NaiveSelection implements Selection{
    private final int threshold;
    private final FitnessCalculator fitnessCalculator = new NaiveFitnessCalculator();

    public NaiveSelection(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public void select(World world) {
    }
}

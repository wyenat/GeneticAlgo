package genalgo.lifecycle.selection;

import genalgo.lifecycle.World;
import genalgo.lifecycle.fitness.FitnessCalculator;

@FunctionalInterface
public interface Selection {
    public abstract void select(World word);
}

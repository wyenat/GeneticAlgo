package genalgo.lifecycle;

import genalgo.lifecycle.crossover.Crossover;
import genalgo.lifecycle.fitness.FitnessCalculator;
import genalgo.lifecycle.mutation.Mutation;
import genalgo.lifecycle.selection.Selection;

import java.util.ArrayList;
import java.util.List;

public abstract class World {
    private final List<Individual> individuals;
    protected FitnessCalculator fitnessCalculator;
    private final Selection selection;
    private final Crossover crossover;
    private final Mutation mutation;

    public World(int popSize, Selection selection, Crossover crossover, Mutation mutation) {
        this.individuals = new ArrayList<>(popSize);
        for (int i = 0; i < popSize; i++) {
            individuals.add(new Individual());
        }
        this.selection = selection;
        this.crossover = crossover;
        this.mutation = mutation;
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

    public void tick(){
        selection.select(this);
        // perform crossover
        // perform mutation
    }

    @Override
    public String toString() {
        return "World{" +
                "individuals=" + individuals +
                '}';
    }
}

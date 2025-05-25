package genalgo.lifecycle.mutation;

import genalgo.lifecycle.Individual;

@FunctionalInterface
public interface Mutation {
    public abstract void mutate(Individual individual);
}

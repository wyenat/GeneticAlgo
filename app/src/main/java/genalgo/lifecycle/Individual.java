package genalgo.lifecycle;

import genalgo.genes.DNA;

public class Individual {
    private final DNA dna;
    private Individual child;

    public Individual() {
        this.dna = new DNA();
    }

    public DNA getDna() {
        return dna;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "dna=" + dna +
                '}';
    }
}

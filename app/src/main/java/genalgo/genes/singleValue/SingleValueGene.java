package genalgo.genes.singleValue;

import genalgo.genes.Gene;

import java.util.Objects;

public class SingleValueGene extends Gene {
    private final double singleValue;

    public SingleValueGene(int id, double x) {
        super(id);
        this.singleValue = x;
    }
    public double getSingleValue() {
        return singleValue;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SingleValueGene that = (SingleValueGene) o;
        return Double.compare(singleValue, that.singleValue) == 0;
    }

}

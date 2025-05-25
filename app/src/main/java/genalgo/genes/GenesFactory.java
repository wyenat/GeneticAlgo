package genalgo.genes;

import genalgo.genes.singleValue.SingleValueGene;

public class GenesFactory {

    public static Gene getRandomSingleValueGene(int id) {
        double x = (Math.random() * 100); // Example: Random x between 0 and 99
        return new SingleValueGene(id, x);
    }
}

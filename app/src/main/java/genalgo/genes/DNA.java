package genalgo.genes;

import java.util.HashMap;

public class DNA {
    private final HashMap<Integer, Gene> genes;

    public DNA() {
        this.genes = new HashMap<>();
    }

    public void addGene(Gene gene) {
        genes.put(gene.getId(), gene);
    }

    public Gene getGene(int id) {
        return genes.get(id);
    }
}

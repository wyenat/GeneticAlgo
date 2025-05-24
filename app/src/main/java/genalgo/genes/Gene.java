package genalgo.genes;

public class Gene {
    private int id;

    public Gene() {
        // Generate a random ID for the gene.
        this.id = (int) (Math.random() * 10000); // Example: Random ID between 0 and 9999
    }

    public int getId() {
        return id;
    }
}

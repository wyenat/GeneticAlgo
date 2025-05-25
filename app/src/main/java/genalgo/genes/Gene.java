package genalgo.genes;

public abstract class Gene {
    private final int id;

    public Gene(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Gene_id=" + id;
    }
}

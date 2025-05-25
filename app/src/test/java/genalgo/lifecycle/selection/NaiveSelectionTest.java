package genalgo.lifecycle.selection;

import genalgo.NaiveWorld;
import genalgo.lifecycle.World;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class NaiveSelectionTest {
    @Test
    public void selection_should_be_able_to_select_individuals() {
        World world = new NaiveWorld(10);
        Selection selection = new NaiveSelection(5);
        selection.select(world);
        assertThat(world.getIndividuals()).hasSize(5);
    }
}

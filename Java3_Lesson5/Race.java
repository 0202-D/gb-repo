import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Dm.Petrov
 * DATE: 02.02.2022
 */
public class Race {
    private ArrayList<Stage> stages;
    public ArrayList<Stage> getStages() { return stages; }
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}

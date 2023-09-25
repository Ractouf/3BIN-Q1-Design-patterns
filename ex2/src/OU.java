import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OU implements Strategy {
    List<Strategy> strategies;

    public OU(Strategy... strategies) {
        this.strategies = new ArrayList<>();

        this.strategies.addAll(Arrays.asList(strategies));
    }

    @Override
    public boolean compare(String word) {
        boolean or = false;

        for (Strategy strategy : strategies)
            if (strategy.compare(word)) or = true;

        return or;
    }
}

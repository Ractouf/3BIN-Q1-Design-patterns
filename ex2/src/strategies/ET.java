package strategies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ET implements Strategy {
    List<Strategy> strategies;

    public ET(Strategy... strategies) {
        this.strategies = new ArrayList<>();

        this.strategies.addAll(Arrays.asList(strategies));
    }

    @Override
    public boolean compare(String word) {
        for (Strategy strategy : strategies)
            if (!strategy.compare(word)) return false;
        return true;
    }
}

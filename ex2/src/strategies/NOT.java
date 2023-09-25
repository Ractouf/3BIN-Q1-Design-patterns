package strategies;

public class NOT implements Strategy {
    private final Strategy strategy;

    public NOT(Strategy strategy) {
        this.strategy = strategy;
    }


    @Override
    public boolean compare(String word) {
        return !strategy.compare(word);
    }
}

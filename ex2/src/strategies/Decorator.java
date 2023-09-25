package strategies;

public class Decorator implements Strategy {

    private final Strategy strategy;
    private int compteur;

    public Decorator(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getCompteur() {
        return compteur;
    }

    @Override
    public boolean compare(String word) {
        if (strategy.compare(word)) compteur++;

        return true;
    }
}

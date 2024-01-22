package strategies;

public class OR implements Strategy {
    private final Strategy s1;
    private final Strategy s2;

    public OR(Strategy s1, Strategy s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public boolean compare(String word) {
        return s1.compare(word) || s2.compare(word);
    }
}

public class LengthStrategy implements Strategy {
    private int length;

    public LengthStrategy(int length) {
        this.length = length;
    }

    @Override
    public boolean compare(String word) {
        return word.length() == length;
    }
}

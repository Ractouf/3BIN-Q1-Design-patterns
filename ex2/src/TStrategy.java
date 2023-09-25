public class TStrategy implements Strategy {
    @Override
    public boolean compare(String word) {
        return word.toLowerCase().startsWith("t");
    }
}

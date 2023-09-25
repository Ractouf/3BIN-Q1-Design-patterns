public class StartsWithStrategy implements Strategy {
    private char startWith;

    public StartsWithStrategy(char startWith) {
        this.startWith = startWith;
    }

    @Override
    public boolean compare(String word) {
        return word.toLowerCase().startsWith(String.valueOf(startWith));
    }
}

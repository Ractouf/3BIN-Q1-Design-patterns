public class PalindromeStrategy implements Strategy {
    @Override
    public boolean compare(String word) {
        StringBuilder temp = new StringBuilder(word);
        return word.equals(temp.reverse().toString());
    }
}

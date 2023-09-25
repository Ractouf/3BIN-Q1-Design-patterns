import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ListerMots listerMots = new ListerMots(args[0]);

        try {
            System.out.println("starts with 't'");
            listerMots.imprimerStrategy(new TStrategy());
            System.out.println("Length");
            listerMots.imprimerStrategy(new LengthStrategy(4));
            System.out.println("Palindrome");
            listerMots.imprimerStrategy(new PalindromeStrategy());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

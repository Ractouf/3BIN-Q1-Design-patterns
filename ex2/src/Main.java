import strategies.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ListerMots listerMots = new ListerMots(args[0]);

        try {
            System.out.println("starts with 't'");
            listerMots.imprimerStrategy(new StartsWithStrategy('t'));
            System.out.println("Length");
            listerMots.imprimerStrategy(new LengthStrategy(4));
            System.out.println("Palindrome");
            listerMots.imprimerStrategy(new PalindromeStrategy());
            System.out.println("strategies.AND");
            listerMots.imprimerStrategy(new AND(new StartsWithStrategy('t'), new LengthStrategy(3)));
            System.out.println("strategies.OR");
            listerMots.imprimerStrategy(new OR(new LengthStrategy(5), new LengthStrategy(6)));
            System.out.println("strategies.NOT");
            listerMots.imprimerStrategy(new NOT(new StartsWithStrategy('t')));
            System.out.println("strategies.ET");
            listerMots.imprimerStrategy(new ET(new StartsWithStrategy('k'), new LengthStrategy(5), new PalindromeStrategy()));
            System.out.println("strategies.OU");
            listerMots.imprimerStrategy(new OU(new StartsWithStrategy('k'), new LengthStrategy(5), new LengthStrategy(4), new PalindromeStrategy()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

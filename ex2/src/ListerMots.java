import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ListerMots {
    private final String file;
    public ListerMots(String file) {
        this.file = file;
    }

    public void imprimerStrategy(Strategy strategy) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(this.file));

        String buffer;

        while ((buffer = input.readLine()) != null) {
            StringTokenizer words = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");

            while (words.hasMoreTokens()) {
                String word = words.nextToken();

                if (strategy.compare(word)) System.out.println(word);
            }
        }
    }
}

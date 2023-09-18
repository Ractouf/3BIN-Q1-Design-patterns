import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LecteurTexte lecteurTexte = new LecteurTexte(new ObsLigne());

        try {
            lecteurTexte.lireFichier(new File("test.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

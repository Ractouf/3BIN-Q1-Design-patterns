import java.io.File;
import java.io.IOException;
import observers.ObsLignes;
import observers.ObsMot;
import observers.ObsMots;
import observers.ObsPalindromes;

public class Main {
    public static void main(String[] args) {
        LecteurTexte lecteurTexte = new LecteurTexte(new ObsLignes(), new ObsMots(), new ObsPalindromes(), new ObsMot("DaMieN"), new ObsMot("eMEriKK"));

        try {
            lecteurTexte.lireFichier(new File("test.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

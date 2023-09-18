import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LecteurTexte {
    ArrayList<Observer> observerList;

    public LecteurTexte(Observer... observers) {
        observerList = new ArrayList<>();

        observerList.addAll(Arrays.asList(observers));
    }

    public void lireFichier(File f) throws IOException {
        BufferedReader lecteurAvecBuffer = null;
        String ligne;

        try {
            lecteurAvecBuffer = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException e) {
            System.out.println("Erreur d'ouverture");
        }

        while ((ligne = lecteurAvecBuffer.readLine()) != null) {
            String finalLigne = ligne;

            observerList.forEach(observer -> observer.traiterLigne(finalLigne));
        }

        lecteurAvecBuffer.close();

        observerList.forEach(observer -> System.out.println(observer.result()));
    }
}

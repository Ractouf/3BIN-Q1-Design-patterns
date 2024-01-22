import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import observers.Observer;

public class LecteurTexte {
    private ArrayList<Observer> observerList;

    public LecteurTexte(Observer... observers) {
        observerList = new ArrayList<>();

        observerList.addAll(Arrays.asList(observers));
    }

    public void lireFichier(File f) throws IOException {
        BufferedReader lecteurAvecBuffer;
        String ligne;

        try {
            lecteurAvecBuffer = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException e) {
            System.out.println("Erreur d'ouverture");
            return;
        }

        while ((ligne = lecteurAvecBuffer.readLine()) != null) {
            String finalLigne = ligne;

            observerList.forEach(observer -> observer.traiterLigne(finalLigne));
        }

        lecteurAvecBuffer.close();

        observerList.forEach(Observer::result);
    }
}

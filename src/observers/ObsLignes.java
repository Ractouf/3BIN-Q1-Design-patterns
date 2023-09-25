package observers;

public class ObsLignes implements Observer {
    private int result;

    @Override
    public void traiterLigne(String ligne) {
        result++;
    }

    @Override
    public void result() {
        System.out.println("Nombre de lignes: " + result);
    }
}

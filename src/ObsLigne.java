public class ObsLigne implements Observer {
    public int result = 0;

    @Override
    public void traiterLigne(String ligne) {
        result ++;
    }

    @Override
    public int result() {
        return result;
    }
}

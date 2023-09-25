package observers;

public class ObsMots implements Observer {
  private int result;

  @Override
  public void traiterLigne(String ligne) {
    result += ligne.split(" ").length;
  }

  @Override
  public void result() {
    System.out.println("Nombre de mots: " + result);
  }
}

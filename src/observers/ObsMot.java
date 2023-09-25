package observers;

public class ObsMot implements Observer {
  String target;
  int result;

  public ObsMot(String target) {
    this.target = target;
  }

  @Override
  public void traiterLigne(String ligne) {
    if (ligne.toLowerCase().contains(target.toLowerCase()))
      result++;
  }

  @Override
  public void result() {
    System.out.println("Nombre de mot " + target + ": " + result);
  }
}

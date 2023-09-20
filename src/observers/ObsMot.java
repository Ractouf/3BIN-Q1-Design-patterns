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
  public int result() {
    return result;
  }
}

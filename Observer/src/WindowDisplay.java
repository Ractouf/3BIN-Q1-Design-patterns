public class WindowDisplay implements IObserver {

  @Override
  public void update(int temp) {
    System.out.println("Window updated with temperature: " + temp);
  }
}

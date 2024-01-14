public class PhoneDisplay implements IObserver {

  @Override
  public void update(int temp) {
    System.out.println("Phone updated with temperature: " + temp);
  }
}

public class Reciever {
  private boolean lightOn;

  public Reciever() {
    this.lightOn = false;
  }

  public void swtichOn() {
    lightOn = true;
    System.out.println("I'm now on");
  }

  public void switchOff() {
    lightOn = false;
    System.out.println("I'm now off");
  }
}

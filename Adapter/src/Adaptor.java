public class Adaptor implements ITarget {
  private Adaptee adaptee;

  public Adaptor(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  public void request() {
    this.adaptee.specificRequest();
  }
}

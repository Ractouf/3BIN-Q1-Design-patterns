public class ConcreteProduct implements IProduct {
  private int size;

  public ConcreteProduct(int size) {
    this.size = size;
  }

  public void howBigAmI() {
    System.out.println("I am " + size + " big");
  }
}

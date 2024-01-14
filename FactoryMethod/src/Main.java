public class Main {
  public static void main(String[] args) {
    ConcreteCreator creatorA = new ConcreteCreator();

    creatorA.factoryMethod(10).howBigAmI();
  }
}

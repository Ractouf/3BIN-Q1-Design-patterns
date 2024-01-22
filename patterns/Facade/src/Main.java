public class Main {
  public static void main(String[] args) {
    ComplicatedClassA classA = new ComplicatedClassA();
    ComplicatedClassB classB = new ComplicatedClassB();
    Facade facade = new Facade(classA, classB);

    facade.doWork();
  }
}

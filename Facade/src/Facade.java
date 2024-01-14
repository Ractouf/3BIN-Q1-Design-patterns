public class Facade {
  private ComplicatedClassA classA;
  private ComplicatedClassB classB;

  public Facade(ComplicatedClassA classA, ComplicatedClassB classB) {
    this.classA = classA;
    this.classB = classB;
  }

  public void doWork() {
    classA.doA();
    classB.doB();
  }
}

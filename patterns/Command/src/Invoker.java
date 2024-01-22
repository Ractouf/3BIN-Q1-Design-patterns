public class Invoker {
  private ICommand buttonA;
  private ICommand buttonB;

  public Invoker(ICommand buttonA, ICommand buttonB) {
    this.buttonA = buttonA;
    this.buttonB = buttonB;
  }

  public void pressButtonA() {
    this.buttonA.execute();
  }
  public void unpressButtonA() {
    this.buttonA.undo();
  }
  public void pressButtonB() {
    this.buttonB.execute();
  }
  public void unpressButtonB() {
    this.buttonB.undo();
  }
}

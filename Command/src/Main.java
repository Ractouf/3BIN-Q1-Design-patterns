public class Main {
  public static void main(String[] args) {
    Reciever light = new Reciever();

    ICommand on = new ConcreteCommandOn(light);
    ICommand off = new ConcreteCommandOff(light);

    Invoker remote = new Invoker(on, off);

    remote.pressButtonA();
    remote.pressButtonB();
    remote.unpressButtonA();
  }
}

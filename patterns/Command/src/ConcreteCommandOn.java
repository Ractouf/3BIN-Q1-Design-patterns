public class ConcreteCommandOn implements ICommand {
  private Reciever reciever;

  public ConcreteCommandOn(Reciever reciever) {
    this.reciever = reciever;
  }

  @Override
  public void execute() {
    this.reciever.swtichOn();
  }

  @Override
  public void undo() {
    this.reciever.switchOff();
  }
}

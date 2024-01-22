public class ConcreteCommandOff implements ICommand {
  private Reciever reciever;

  public ConcreteCommandOff(Reciever reciever) {
    this.reciever = reciever;
  }

  @Override
  public void execute() {
    this.reciever.switchOff();
  }

  @Override
  public void undo() {
    this.reciever.swtichOn();
  }
}

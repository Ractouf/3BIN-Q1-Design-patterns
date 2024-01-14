public class Client {
  private final IStrategy strategy;

  public Client(IStrategy strategy) {
    this.strategy = strategy;
  }

  public void execute() {
    strategy.run();
  }
}

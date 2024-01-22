public class Client {
  private Adaptor adaptor;

  public Client(Adaptor adaptor) {
    this.adaptor = adaptor;
  }

  public void doWork() {
    adaptor.request();
  }
}

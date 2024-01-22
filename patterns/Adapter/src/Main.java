public class Main {
  public static void main(String[] args) {
    Adaptee adaptee = new Adaptee();
    Adaptor adaptor = new Adaptor(adaptee);
    Client client = new Client(adaptor);

    client.doWork();
  }
}

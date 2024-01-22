public class PayPalStrategy implements Strategy {
  private String email, password;

  public PayPalStrategy(String email, String password) {
    this.email = email;
    this.password = password;
  }

  @Override
  public void pay(int amount) {
    String encryptedPassword= password.replaceAll(".", "*");
    System.out.println(amount + " euros paid using Paypal / email: " + email+ ", password: "+encryptedPassword);
  }
}

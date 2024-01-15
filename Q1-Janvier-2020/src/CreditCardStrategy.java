public class CreditCardStrategy implements Strategy {
  private String name, cardNumber, expiryDate;

  public CreditCardStrategy(String name, String cardNumber, String expiryDate) {
    this.name = name;
    this.cardNumber = cardNumber;
    this.expiryDate = expiryDate;
  }

  @Override
  public void pay(int amount) {
    String encryptedCardNumber= cardNumber.replaceAll(".", "*");
    System.out.println(amount + " euros paid using CreditCard / name: " + name+ ", card number: "+encryptedCardNumber+ " (expiration date: "+expiryDate+")");
  }
}

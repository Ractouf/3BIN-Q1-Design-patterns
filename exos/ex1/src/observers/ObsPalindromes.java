package observers;

public class ObsPalindromes implements Observer {
  private int result;

  @Override
  public void traiterLigne(String ligne) {
    String[] mots = ligne.split(" ");

    for (String mot : mots)
      if (isPalindrome(mot.toLowerCase())) result++;
  }

  @Override
  public void result() {
    System.out.println("Nombre de palindromes: " + result);
  }

  private boolean isPalindrome(String word) {
    StringBuilder temp = new StringBuilder(word);

    return word.equals(temp.reverse().toString());
  }
}

package observers;

public class ObsPalindromes implements Observer {
  private int result;

  @Override
  public void traiterLigne(String ligne) {
    String[] mots = ligne.split(" ");

    for (String mot : mots)
      if (isPalindrome(mot)) result++;
  }

  @Override
  public int result() {
    return result;
  }

  private boolean isPalindrome(String word) {
    word = word.toLowerCase();

    int left = 0;
    int right = word.length() - 1;

    while (left < right) {
      if (word.charAt(left) != word.charAt(right)) return false;

      left++;
      right--;
    }

    return true;
  }
}

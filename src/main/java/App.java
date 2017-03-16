import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Enter any single word and learn its scrabble score.");
    String input = console.readLine();
    ScrabbleScore userWord = new ScrabbleScore();
    System.out.println("Your score is: " + userWord.calculateScore(input));
  }
}

import org.junit.*;
import static org.junit.Assert.*;

  public class ScrabbleScoreTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() {
      ScrabbleScore testScrabble = new ScrabbleScore();
      int expected = 1;
      assertEquals(expected, testScrabble.calculateScore("a"));
    }

    // @Test
    // public void calculateScore_returnsScoreForArrayOfLetters_1() {
    //   ScrabbleScore testScrabble = new ScrabbleScore();
    //   Integer expected = 1;
    //   assertEquals(expected, testScrabble.calculateScore("e"));
    // }

    // @Test
    // public void calculateScore_returnsScoreForArrayOfLetters_2() {
    //   ScrabbleScore testScrabble = new ScrabbleScore();
    //   Integer expected = 2;
    //   assertEquals(expected, testScrabble.calculateScore("d"));
    // }
  }

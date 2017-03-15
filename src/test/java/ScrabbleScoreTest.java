import org.junit.*;
import static org.junit.Assert.*;

  public class ScrabbleScoreTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() {
      ScrabbleScore testScrabble = new ScrabbleScore();
      int expected = 1;
      assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForArrayOfLetters_2() {
      ScrabbleScore testScrabble = new ScrabbleScore();
      int expected = 3;
      assertEquals(expected, testScrabble.calculateScore("b"));
    }

    @Test
    public void calculateScore_returnsScoreForArrayOfLetters_3() {
      ScrabbleScore testScrabble = new ScrabbleScore();
      int expected = 2;
      assertEquals(expected, testScrabble.calculateScore("aa"));
    }

    @Test
    public void calculateScore_returnsScoreForArrayOfLetters_4() {
      ScrabbleScore testScrabble = new ScrabbleScore();
      int expected = 12;
      assertEquals(expected, testScrabble.calculateScore("zoo"));
    }
  }

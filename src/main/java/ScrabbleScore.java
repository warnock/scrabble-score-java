import java.util.ArrayList;
import java.util.List;

public class ScrabbleScore {
  String[] letterValue1 = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};

  Integer result = 0;

  public Integer calculateScore(String letter){
    for ( String eachLetterValue1 : letterValue1 ) {
      if (eachLetterValue1.equals(letter)) {
        result = 1;
      }
    }
    return result;
  }
}

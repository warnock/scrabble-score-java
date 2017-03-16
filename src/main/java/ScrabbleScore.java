import java.util.ArrayList;
import java.util.List;

public class ScrabbleScore {

  String[] letters = {"a", "b", "c", "d", "e", "f", "g" ,"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
  Integer[] scores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

  public int calculateScore(String input){
    int totalScore = 0;
    String[] inputArray = input.toLowerCase().split("");
    for (int a = 0; a < inputArray.length; a++) {
      for (int b = 0; b < letters.length; b++) {
        if (inputArray[a].equals(letters[b])) {

          int index = b;
          totalScore = totalScore + scores[index];

          //find the index of the match inside of letters
          //then use that number to .get() from the scores Array
          //add that to total score tally

        }
      }
    }
    return totalScore;
  }
}

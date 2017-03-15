import java.util.ArrayList;
import java.util.List;

public class ScrabbleScore {

  String[] letters = {"a", "b"};
  Integer[] scores = {1, 3};


  public int calculateScore(String input){
    int totalScore = 0;
    String[] inputArray = input.split("");
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

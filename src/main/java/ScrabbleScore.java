import java.util.ArrayList;
import java.util.List;

public class ScrabbleScore {

  String[] letters = {"a", "b"}; //go to z
  Integer[] scores = {1, 3};
  // String[] letterValue2 = {"d", "g"};

  // Integer result = 0;

  public int calculateScore(String input){
    int totalScore = 0;
    String[] inputArray = input.split("");
    for (Integer a = 0; a <= inputArray.length; a++) {
      for (Integer b = 0; b <= letters.length; b++) {
        if (inputArray[a].equals(letters[b])) {

          int index = b;
          totalScore = totalScore + scores[index];




          //find the index of the match inside of letters
          //then use that number to .get() from the scores Array
          //add that to total score tally


















          // totalScore = totalScore + scores[0];



          // Integer index = Integer.parseInt(letters[b]);
          //
          // scores.get(index);
          //
          // totalScore = totalScore + scoreIndex;  //must change to index of match eventually


        }
      }

      // if (input.Character.isLetter(i).equals(letterValue1)) {
      //   i = 1;
      //   result = i;
      // }

      // else if (eachLetterValue2.equals(letter)) {
      //   result = 2;
      // }
    }
    return totalScore;
  }
}

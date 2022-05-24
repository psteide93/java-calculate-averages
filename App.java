import java.util.Arrays;

public class App {
  public static void main(String args[]) {
    int[] testScores = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };
    Arrays.sort(testScores);
    int[] sortedTestScores = new int[10];
    System.arraycopy(testScores, 0, sortedTestScores, 0, 10);
    int mean = meanCalculator(sortedTestScores);
    int median = medianCalculator(sortedTestScores);
    int highScore = sortedTestScores[9];
    int lowScore = sortedTestScores[0];
    System.out.println(("The average test score is " + mean));
    System.out.println(("The median test score is " + median));
    System.out.println(("The highest test score is " + highScore));
    System.out.println(("The lowest test score is " + lowScore));

  }

  private static int meanCalculator(int[] numbersArray) {
    int sum = 0;
    for (int index = 0; index < numbersArray.length; index++) {
      sum = sum + numbersArray[index];
    }
    return sum / numbersArray.length;
  }

  private static int medianCalculator(int[] numbersArray){
    int index = numbersArray.length/2;
    int[] medianArray = {numbersArray[index], numbersArray[index-1]};
    return meanCalculator(medianArray);
  }

}
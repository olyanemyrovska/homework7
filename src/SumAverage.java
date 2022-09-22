import java.util.function.ToDoubleFunction;

/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {
    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        // TODO fill in code here using for loop and replace the return statement
            int sumNum = 0;
            for (int i = lowerBound; i <= upperBound; i++) {
                if (lowerBound > upperBound) {
                    System.out.println("lowerBound is greater than upperBound");
                    break;
                }
                sumNum += i;
            }
        return sumNum;
    }
  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    // TODO fill in code here using for each loop and replace the return statement
      int sum = 0;
      for (int element : numbers
           ) {
          sum += element;
      }
      return sum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    // TODO fill in code here using while loop and replace the return statement
      double average;
      double sum = 0;
      int currentNum = lowerBound;
      int counter = 0;
      while(currentNum <= upperBound){
       sum = sum + currentNum;
       currentNum += 1;
       counter +=1;
   }
      average = sum/counter;
      return average;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    // TODO fill in code here using do-while loop and replace the return statement
      double sumAve = 0;
    int i = 0;
      do{
      sumAve += numbers[i];
      i++;
    } while(i<numbers.length);
   return sumAve/numbers.length ;
  }
}
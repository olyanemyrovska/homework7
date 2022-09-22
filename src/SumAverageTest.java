import static org.testng.Assert.assertEquals;

import java.util.stream.IntStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumAverageTest {

  /**
   * Test data for lower and upper bounds.
   *
   * @return test data array
   */
  @DataProvider(name = "Sum")
  public static Object[][] sum() {
    return new Object[][]{
        {1, 100, 5050},
        {-100, 100, 0},
        {1, 1, 1},
        {5, 10, 45},
        // TODO add 2 more test data here
    };
  }

  /**
   * Test data for lower and upper bounds.
   * @return test data array
   */
  @DataProvider(name = "Average")
  public static Object[][] average() {
    return new Object[][]{
        {1, 100, 50.5},
        {-100, 100, 0.0},
        {1, 1, 1.0},
        {700, 100, 400.0}
        // TODO add 2 more test data here
    };
  }

  @Test(dataProvider = "Sum")
  public void testSumArray(int lowerBound, int upperBound, int expectedResult) {
    int actualResult = SumAverage.sum(lowerBound, upperBound);

    assertEquals(actualResult, expectedResult, "Sum is not correct");
  }

  @Test(dataProvider = "Sum")
  public void testSum1(int lowerBound, int upperBound, int expectedResult) {
    int[] numbers = IntStream.range(lowerBound, upperBound + 1).toArray();
    int actualResult = SumAverage.sum(numbers);

    assertEquals(actualResult, expectedResult, "Sum is not correct");
  }

  @Test(dataProvider = "Average")
  public void testAverage(int lowerBound, int upperBound, double expectedResult) {
    double actualResult = SumAverage.average(lowerBound, upperBound);

    assertEquals(actualResult, expectedResult, "Average is not correct");
  }

  @Test(dataProvider = "Average")
  public void testAverageArray(int lowerBound, int upperBound, double expectedResult) {
    int[] numbers = IntStream.range(lowerBound, upperBound + 1).toArray();
    double actualResult = SumAverage.average(numbers);

    assertEquals(actualResult, expectedResult, "Average is not correct");
  }
}
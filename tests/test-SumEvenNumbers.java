import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumEvenNumbersTest {

  @Test 
  void testSingleEvenElementSum() {
    int [] arr = {4};
    assertEquals(4, SumEvenNumbers.sumEvenArray(arr)); 
  } 

  @Test
  void testSingleOddElementSum() {
    int [] arr = {9}; 
    assertEquals(0, SumEvenNumbers.sumEvenArray(arr));
  }

  @Test
  void testSumOfEvenPositiveElements() {
    int [] arr = {2, 3, 4, 7, 9}; 
    assertEquals(6, SumEvenNumbers.sumEvenArray(arr)); 
  } 
  
  @Test
  void testSumOfEvenNegativeElements() { 
    int [] arr = {-4, -2, -3, -8, -6};
    assertEquals(-20, SumEvenNumbers.sumEvenArray(arr));
  }

  @Test
  void testMixedSignValues() {
    int [] arr = {2, -4, 7, 8, -2}; 
    assertEquals(4, SumEvenNumbers.sumEvenArray(arr)); 
  }

  @Test
  void testEmptyArraySum() {
    int [] arr = {};
    assertEquals(0, SumEvenNumbers.sumEvenArray(arr)); 
  } 
}
      

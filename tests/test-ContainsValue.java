import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsValueTest {

  void testValueNotFound() {
    int [] arr = {2, 3, 4, 5, 9};
    assertFalse(ContainsValue.contains(arr, 7)); 
  }

  void testValueFound() {
    int [] arr = {-3, -4, -6, 0, 9};
    assertTrue(ContainsValue.contains(arr, -3));
  }

  void testValueNotFoundEmptyArray() {
    int [] arr = {};
    assertFalse(ContainsValue.contains(arr, 8)); 
  }

  void testValueFoundSingleElementArray() {
    int [] arr = {0}; 
    assertTrue(ContainsValue.contains(arr, 0));
  }

  void testValueNotFoundSingleElementArray() {
    int [] arr = {3};
    assertFalse(ContainsValue.contains(arr, 49));
  }

  void testMultipleValues() {
    int [] arr = {2, 0, -7, 4, 9, 13, 5};
    assertFalse(ContainsValue.contains(arr, 73));
    assertTrue(ContainsValue.contains(arr, 4)); 
    assertFalse(ContainsValue.contains(arr, 97)); 
    assertTrue(ContainsValue.contains(arr, 0));
  }
}
    

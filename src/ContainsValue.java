public static boolean contains(int[] array, int i, int value) {
  if (i == array.length) {
    return false; 
  } else {
    return (array[i] == value || contains(array, i+1, value); 
  }
}

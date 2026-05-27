public static int sumEvenArray(int[] array, int i) {
  if (i == array.length) {
    return 0; 
  } else if (array[i] % 2 == 0) {
    return array[i] + sumEvenArray(array, i+1);
  } else {
    return sumEvenArray(array, i+1); 
  }
}

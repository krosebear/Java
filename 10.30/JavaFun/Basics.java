import java.util.ArrayList;
public class Basics {
  public Integer printMaxArr(int[] arr){
    int max = arr[0];
    for(int i = 1; i <arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }
    System.out.println(max);
    return max;
  }
  //
  // public Integer printAvgArr(int[] arr){
  //   int sum = 0;
  //   int len = arr.length;
  //   for(int i = 1; i <len; i++){
  //       sum = sum + arr[i];
  //   }
  //   System.out.println(sum/len);
  //   return sum/len;
  // }
  //
  //
  public void printOddArr() {
    ArrayList<Integer> myArray = new ArrayList<Integer>();

        for (int i = 1; i < 256; i = i + 2) {
            myArray.add(i);
        }

        System.out.println(myArray);
  }
  //
    public String basics(int number) {
      int count = 0;
      for(int i = 0; i<number; i++) {
        count = count + i;
      }
      return String.valueOf(count);
    }
    //
  //
    public Integer gTY(int num, int[] x) {
      int count = 0;
      for(int i = 0; i<x.length; i++) {
        if(x[i]> num){
          count = count + 1;
        }
      }
      System.out.println(count);
      return count;
    }
    //
  //
  public void squareValues(int[] givenArray){
    int length = givenArray.length;
    for (int i = 0; i < length; i++) {
      givenArray[i] = givenArray[i] * givenArray[i];
    }
    System.out.println(givenArray);
  }
    //
    public String basicOdd(int number) {
      int count = 0;
      for(int i = 0; i < number; i++) {
        if(i % 2 != 0){
          count = count + i;
        }
      }
      return String.valueOf(count);
    }
    public String printSum(int number) {
      int count = 0;
      for(int i = 0; i < number; i++) {
          count = count + i;
          System.out.println("New Number "+ i + " sum: " + String.valueOf(count));
          }
          return String.valueOf(count);
    }
    //
    public Integer printArray(int[] arr) {
      for(int i = 0; i < arr.length; i++) {
        int element = arr[i];
        System.out.println(String.valueOf(element));
      }
      return arr[0];
    }
    //
    //
    public void removeNegNum(int[] array) {
      ArrayList<Integer> myArray = new ArrayList<Integer>();
        int length = array.length;
        for(int i = 0; i < length; i++) {
            if(array[i] < 0) {
                myArray.add(0);
            } else {
                myArray.add(array[i]);
            }
        }
        System.out.println(myArray);
    }
    //
    //
    public void maxMinAvg(int[] array) {
      ArrayList<Integer> myArray = new ArrayList<Integer>();
        int len = array.length;
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for(int i = 1; i < len; i++){
          sum = sum + array[i];
          if(max < array[i]){
            max = array[i];
          }
          if(min > array[i]){
            min = array[i];
          }
        }
        int avg = sum/len;
        myArray.add(max);
        myArray.add(min);
        myArray.add(avg);
        System.out.println(myArray);
    }
    //
    public void arrayShift(int[] givenArray){
        int length = givenArray.length - 1;

        for(int i = 0; i < length; i++){
            givenArray[i] = givenArray[i + 1];
        }

        givenArray[length] = 0;

        System.out.println(givenArray);
    }
}

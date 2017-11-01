
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Puzzling {
  public void gTTen(int[] arr){
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    for(int i = 0; i <arr.length; i++){
      if(arr[i]>10){
        myArray.add(arr[i]);
      }
    }
    System.out.println(myArray);
  }
  public void shuffle(String[] x) {
    ArrayList<String> myArray = new ArrayList<String>();
    for(int i = 0; i<x.length; i++){
      myArray.add(x[i]);
    }
    Collections.shuffle(myArray);
    System.out.println(myArray);
  }
  //
  public void largerThanFive(String[] x) {
    ArrayList<String> myArray = new ArrayList<String>();
    for(int i = 0; i<x.length; i++){
      if(x[i].length() > 5){
        myArray.add(x[i]);
      }
    }
    Collections.shuffle(myArray);
    System.out.println(myArray);
  }
  //
  //
  public void alphaBet(char[] x) {
    ArrayList<Character> myArray = new ArrayList<Character>();
    for(int i = 0; i<x.length; i++){
        myArray.add(x[i]);
      }
    Collections.shuffle(myArray);
    // ArrayList<Character> vowelArray = new ArrayList<Character>();
    // vowelArray.add('a');
    // vowelArray.add('e');
    // vowelArray.add('o');
    // vowelArray.add('u');
    // vowelArray.add('y');
    // vowelArray.add('i');
    char[] vowels = {'a','e','i','o','u'};
    char first = myArray.get(0);
    for(int j = 0; j < vowels.length; j++){
      if(first == vowels[j]){
        System.out.println("The first letter is a vowel");
      }
    }
    System.out.println(myArray.get(0));
  }
  //
  public ArrayList<Integer> genTen() {
		ArrayList<Integer> resultArray = new ArrayList<Integer>();
		Random randomGenerator = new Random();

		for(int i = 0; i < 10; i++) {
			resultArray.add(randomGenerator.nextInt(101 - 55) + 55);
		}

		return resultArray;
	}
  public ArrayList<Integer> getTenSorted(ArrayList<Integer> list) {
		ArrayList<Integer> copyArray = new ArrayList<Integer>(list);
		Collections.sort(copyArray);

		System.out.println(copyArray.get(0));
		System.out.println(copyArray.get(copyArray.size() - 1));
    System.out.println(copyArray);
		return list;
	}
  //
  public String randomWord(String[] a){
    String random = "";
    Random r = new Random();
    for(int i = 0; i<5; i++){
      int j = r.nextInt(26);
      random = random + a[j];
      }
      System.out.println(random);
      return random;
    }
    //
  //
  public void randomArrWord(String[] a){
    ArrayList<String> wordArr = new ArrayList<String>();
    Random r = new Random();
    for(int i = 0; i<10; i++){
      String random = "";
      for(int k = 0; k<5; i++){
        int j = r.nextInt(26);
        random = random + a[j];
      }
      wordArr.add(random);
    }
    System.out.println(wordArr);
  }
    //
  }

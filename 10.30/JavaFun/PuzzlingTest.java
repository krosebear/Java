public class PuzzlingTest{
  public static void main(String[] args){
    Puzzling puz = new Puzzling();
    int[] arr = {3,5,1,2,7,9,8,13,25,32};
    // puz.gTTen(arr);
    String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    // puz.shuffle(names);
    // puz.largerThanFive(names);
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    String[] alphabetString = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    // puz.alphaBet(alphabet);
    // System.out.println(puz.genTen());
    // System.out.println(puz.getTenSorted(puz.genTen()));
    puz.randomWord(alphabetString);
    puz.randomArrWord(alphabetString);
  }
}

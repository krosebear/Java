public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator test = new StringManipulator();
        String testest = test.trimAndConcat("Hello", "World");
        System.out.println(testest);
        char letter = 'c';
        Integer idx = test.getIndexOrNull("Coding", letter);
        System.out.println(idx);
        String test2 = test.concatSubstring("Hello",1, 2, "World");
        System.out.println(test2);
    }
}
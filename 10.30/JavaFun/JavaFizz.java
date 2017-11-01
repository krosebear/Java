public class JavaFizz {
    public String fizzBuzz(int number) {
        String a = "Fizz";
        String b = "Buzz";
        String c = "FizzBuzz";
        if(number % 3==0 && number % 5== 0) {
            return c;
        }else if(number % 3==0){
                return a;
            }else if(number % 5==0) {
                return b;
        }
        else{
            return String.valueOf(number);
        }
    }
}        
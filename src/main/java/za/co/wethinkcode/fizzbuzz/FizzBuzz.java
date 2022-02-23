package za.co.wethinkcode.fizzbuzz;

public class FizzBuzz {
    public String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if ( divisibleBy3 || divisibleBy5 ) {
            return "";
        }
        return String.valueOf(number);
    }

    public String countTo(int number) {
        return null;
    }
}

package za.co.wethinkcode.fizzbuzz;

public class FizzBuzz {
    /**
     *
     * @param number the value of 3 and 5 as an int. and checks the value of the number.
     * @return prints out what the number represents, divisbleby3 prints out Fizz, divisbleby5 prints out Buzz,
     * divisbleby3 and divisbleby5 prints out FizzBuzz.
     */
    public String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if ( divisibleBy3 && divisibleBy5 ) {
            return "FizzBuzz";
        }
        if (divisibleBy3){
            return "Fizz";
        }
        if (divisibleBy5){
            return "Buzz";
        }

        return String.valueOf(number);
    }
    /**
     * the for loop is to run through the array and to check for the Fizz, Buzz, FizzBuzz.
     * if the numbers are not apart of Fizz, Buzz, FizzBuzz then to print out normal numbers.
     * in the loop it will add a +1 to num at the end of the loop and then it will run the loop again till it,
     * gets to the ffinal interger being FizzBuzz.
     * @param number the value of 3 and 5 as an int. and checks the value of the number.
     * @return returns the function so that it can do the loop all over again.
     */
    public String countTo(int number) {

        String output = "[";
        for(int num = 0; num < number; num++) {
            String val = checkNumber(num + 1);
            if (num == 0) {
                output = output + val;
            } else if (num == number - 1) {
                output = output + ", " + val + "]";
            } else {
                output = output + ", " + val;
            }
        }
        return output;
    }
}

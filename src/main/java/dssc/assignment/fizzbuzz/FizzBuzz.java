package dssc.assignment.fizzbuzz;

/* Write a Java program that prints the numbers from 1 to 100 to the "standard" output stream and follows
 these rules:
*For multiples of 3 it prints Fizz instead of the number.
*For multiples of 5 it prints Buzz instead of the number.
*For numbers which are multiples of both 3 and 5 it prints FizzBuzz.  */

public class FizzBuzz {

    public static void main(String... args) {
        for (int i=1; i<=100; i++)
        {
            if (i%3 == 0 && i%5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i%5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
        
    }

    public String convert(int number) {
        if (number == 3){
            return "Fizz";
        }
        return Integer.toString(number);
    }
}

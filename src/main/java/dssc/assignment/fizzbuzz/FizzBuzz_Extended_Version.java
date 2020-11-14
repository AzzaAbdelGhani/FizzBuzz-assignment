package dssc.assignment.fizzbuzz;
/* Write a Java program to print numbers from 1 to 105 and apply these additional rules:
*For multiples of 7 it prints Bang instead of the number.
*For numbers which are multiples of both 3 and 7 it prints FizzBang.
*For numbers which are multiples of both 5 and 7 it prints BuzzBang.
*For numbers which are multiples of 3, 5 and 7 it prints FizzBuzzBang.*/

public class FizzBuzz_Extended_Version {
    public static void main(String... args) {
        for (int i=1; i<=105; i++)
        {
            if (i%3 == 0 && i%5 == 0 && i%7 == 0)
            {
                System.out.println("FizzBuzzBang");
            }
            else if (i%5 == 0 && i%7 == 0)
            {
                System.out.println("BuzzBang");
            }
            else if (i%3 == 0 && i%7 == 0)
            {
                System.out.println("FizzBang");
            }
            else if (i%7 == 0)
            {
                System.out.println("Bang");
            }
            else
            {
                System.out.println(i);
            }
        }

    }
}

import java.util.Scanner;
public class IsPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//creat a new scanner object
        System.out.print("Enter a number:");// ask to get input
        int number = scanner.nextInt(); // The nextInt() method of a Scanner object reads in a string of digits (characters) and converts them into an int type
        if (number < 2){ //first condition if less than 2 it's def not a prime
            System.out.println(number + " is not a prime");
        } else {
            /* in the else statement here, we assign i =2 since we know for sure that number 2 is prime
             ,set a default value for check as false */
            int i = 2;
            boolean check = true;
            // Using  while to run the loop until the value of i is less than the square root of input number
            // set boolean check true, then creat a if statement to check if input nb can be divisible by i, result will be  false
            while (i <= number/2) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }
}






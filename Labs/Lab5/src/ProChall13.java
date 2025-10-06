import java.util.Scanner;

/**
 * This is a class that takes an int from user input and evaluates whether it is a prime number
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 10/4/25
 */

public class ProChall13 {

    public static void main(String[] args) {
        Scanner input;
        int number;
        String check;

        boolean run = true;

        input = new Scanner(System.in);

        do {
            System.out.print("Enter a number>2 to test if it is prime: ");
            number = input.nextInt();

            if (testForPrime(number)) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }

            System.out.print("\nEnter yes to try another number: ");
            check = input.next();

            if (!check.toLowerCase().equals("yes")) {
                run = false;
            }

        } while (run);
    }

    /**
     * This function tests if a given number is prime
     * @param number The number to be tested
     * @return Returns true if the number is prime, false if not
     */
    public static boolean testForPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}

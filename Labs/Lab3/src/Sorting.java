import java.util.Scanner;

/**
 * This class takes in 3 numbers and sorts them from least to greatest
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/21/2025
 */

public class Sorting
{
    public static void main(String[] args)
    {

        int one, two, three;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        one = input.nextInt();

        System.out.print("Enter a number: ");
        two = input.nextInt();

        System.out.print("Enter a number: ");
        three = input.nextInt();

        if (one <= two && one <= three) {
            if (two <= three) {
                System.out.println(one + " " + two + " " + three);
            } else {
                System.out.println(one + " " + three + " " + two);
            }
        } else if (two <= one && two <= three) {
            if (one <= three) {
                System.out.println(two + " " + one + " " + three);
            } else {
                System.out.println(two + " " + three + " " + one);
            }
        } else {
            if (one <= two) {
                System.out.println(three + " " + one + " " + two);
            } else {
                System.out.println(three + " " + two + " " + one);
            }
        }

    }
}

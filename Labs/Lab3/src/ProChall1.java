import java.util.Scanner;

/**
 * This class can take in any number 1-3 and convert it into roman numerals
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/20/2025
 */

public class ProChall1
{
    public static void main(String[] args)
    {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number 1-3 to be converted: ");
        number = input.nextInt();

        switch(number) {

            case 1:
                System.out.println("Your number in roman numerals is I");
                break;

            case 2:
                System.out.println("Your number in roman numerals is II");
                break;

            case 3:
                System.out.println("Your number in roman numerals is III");
                break;

            default:
                System.out.println("Enter a number between 1-3");

        }

    }
}

import java.util.Scanner;

/**
 * This class takes in the name of a city and counts the number of characters in its name, displays it in lowercase and uppercase, and displays the first letter of its name
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/14/2025
 */

public class ProChall12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String city;

        System.out.print("Enter a city: ");
        city = input.nextLine();

        System.out.println("\nThe city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));

    }

}

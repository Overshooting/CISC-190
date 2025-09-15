import java.util.Scanner;

/**
 * This is a class that takes in a person's first, middle, and last names, then uses them to find their initials
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/14/2025
 */

public class ProChall2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName, middleName, lastName;
        char firstInitial, middleInitial, lastInitial;

        System.out.print("Enter your first name: ");
        firstName = input.nextLine();
        firstInitial = firstName.charAt(0);

        System.out.print("Enter your middle name: ");
        middleName = input.nextLine();
        middleInitial = middleName.charAt(0);

        System.out.print("Enter your last name: ");
        lastName = input.nextLine();
        lastInitial = lastName.charAt(0);

        System.out.println("\nYour name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Your initials are: " + firstInitial + middleInitial + lastInitial);

    }

}

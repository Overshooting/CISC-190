import java.util.Scanner;

/**
 * This class will take in a String and a character, then will print out the number of times that character appears in the given String
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/27/25
 */

public class ProChall5 {

    public static void main(String[] args) {

        String sentence;
        char character;
        int sum = 0;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a String: ");
        sentence = input.nextLine();

        System.out.print("Enter the char to be assessed: ");
        character = input.nextLine().charAt(0);

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                sum++;
            }
        }

        System.out.println("There are " + sum + " " + character + "(s)");

    }

}

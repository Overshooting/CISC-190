import java.util.Scanner;

/**
 * This class takes in a number then constructs a diamond out of stars with its maximum width dictated by the given number
 *
 * @author Alexander Melis, aamel
 * @version 1.0
 * @since 9/28/25
 */

public class Flashback {

    public static void main(String[] args) {

        String finalString = "";
        int maxStars, numSpaces, numStars;

        Scanner input = new Scanner(System.in);

        System.out.print("How wide should the diamond be? ");
        maxStars = input.nextInt();

        if (maxStars % 2 == 0) {
            maxStars++;
        }

        for (int i = 0; i < maxStars/2; i++) {
            numSpaces = (maxStars / 2 - i);

            for (int k = 0; k < numSpaces; k++) {
                finalString += " ";
            }

            numStars = 2*i + 1;

            for (int k = 0; k < numStars; k++) {
                finalString += "*";
            }

            finalString += "\n";
        }

        for (int i = 0; i < maxStars; i++) {
            finalString += "*";
        }

        finalString += "\n";

        for (int i = maxStars/2-1; i >= 0; i--) {
            numSpaces = (maxStars / 2 - i);

            for (int k = 0; k < numSpaces; k++) {
                finalString += " ";
            }

            numStars = 2*i + 1;

            for (int k = 0; k < numStars; k++) {
                finalString += "*";
            }

            for (int k = 0; k < numSpaces; k++) {
                finalString += " ";
            }

            finalString += "\n";
        }

        System.out.println(finalString);

    }

}

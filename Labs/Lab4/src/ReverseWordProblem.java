import java.util.Scanner;

/**
 * This class takes in a list of words and checks whether each one is spelled the same backward when it's first letter is moved to the back
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/28/25
 */

public class ReverseWordProblem {

    public static void main(String[] args) {

        String words, thisWord, yesOrNo;
        boolean run = true;

        Scanner input = new Scanner(System.in);
        input.useDelimiter(" quit");

        Scanner noDelimiter = new Scanner(System.in);

        Scanner sentenceReader;

        while (run) {

            System.out.print("Enter words seperated by a space ending with the word quit: ");
            words = input.next();

            sentenceReader = new Scanner(words);

            while (sentenceReader.hasNext()) {
                thisWord = sentenceReader.next();

                String tempword = thisWord.substring(0,1);
                for (int i = thisWord.length()-1; i >= 1; i--) {
                    tempword += thisWord.charAt(i);
                }

                if (thisWord.equals(tempword)) {
                    System.out.println(thisWord + " works");
                } else {
                    System.out.println(thisWord + " does not work");
                }
            }

            System.out.print("Enter yes to process another line? ");
            yesOrNo = noDelimiter.next().toLowerCase();

            if (!yesOrNo.equals("yes")) {
                run = false;
            }

        }
    }

}

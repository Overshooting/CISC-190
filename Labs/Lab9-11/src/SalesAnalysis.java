import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class reads an input file of sales in a week and then processes them and prints them to console
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 11/23/25
 */

public class SalesAnalysis {

    public static final int WEEKS_IN_MONTH = 4;

    private double[] weeklyNumber;
    private String inputFile;
    private int lineNumber;

    /**
     * Creates a SalesAnalysis object with the given input file path as its input file
     * @param inputFileString The path to the input file
     */
    public SalesAnalysis(String inputFileString) {
        inputFile = inputFileString;

        weeklyNumber = new double[WEEKS_IN_MONTH];
        lineNumber = 0;
    }

    /**
     * Reads each line in the file and passes it off to its helper method
     * @throws IOException Throws IOException if the object's file path leads to nowhere
     */
    public void processFile() throws IOException {
        File thisInputFile = new File(inputFile);
        Scanner thisFileInput = new Scanner(thisInputFile);

        while (thisFileInput.hasNextLine()) {
            String[] thisLine = thisFileInput.nextLine().split(",");

            setArrayElement(thisLine);
        }

        lineNumber = 0;
        thisFileInput.close();
    }

    /**
     * Parses the given array of Strings, converts each to a double, and totals them
     * @param inArray The array of Strings representing one week of sales
     */
    private void setArrayElement(String[] inArray) {
        double total = 0;
        for (String thisNum : inArray) {
            total += Double.parseDouble(thisNum);
        }

        weeklyNumber[lineNumber] = total;
        lineNumber++;
    }

    /**
     * Builds a String containing all relevant information from the object's file, then prints it
     */
    public void writeOutput() {
        String accumulator = "";
        double fullTotal = 0;
        int lowest = 0;
        int highest = 0;

        for (lineNumber = 0; lineNumber < weeklyNumber.length; lineNumber++) {
            accumulator += "Week" + (lineNumber + 1) + " Info\n";
            accumulator += "Total Sales: " + String.format("$%,.2f", weeklyNumber[lineNumber]) + "\n";
            accumulator += "Avg Daily Sales for Week: " + String.format("$%,.2f", weeklyNumber[lineNumber]/7) + "\n";

            fullTotal += weeklyNumber[lineNumber];

            if (weeklyNumber[lowest] > weeklyNumber[lineNumber]) {
                lowest = lineNumber;
            }

            if (weeklyNumber[highest] < weeklyNumber[lineNumber]) {
                highest = lineNumber;
            }
        }

        accumulator += "\nTotal Sales for all Weeks: " + String.format("$%,.2f", fullTotal) + "\n";
        accumulator += "Average Weekly Sales: " + String.format("$%,.2f", fullTotal/WEEKS_IN_MONTH) + "\n";
        accumulator += "Week" + highest + " had the highest sales\n";
        accumulator += "Week" + lowest + " had the lowest sales";

        System.out.println(accumulator);
        lineNumber = 0;
    }

}

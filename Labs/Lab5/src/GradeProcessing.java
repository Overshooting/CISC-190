import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 * This class takes in a file path for an input and an output file, then evaluates the grades found in the input file and writes its output into the output file
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 10/5/25
 */

public class GradeProcessing {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String in, out;

        in = getInFile();
        out = getOutFile();

        processFile(in, out);

        System.out.println("Your file has been processed, the output may be viewed at " + out);
    }

    /**
     * This method returns a valid path to an input file read with Scanner from system input
     * @return Returns a String representing a valid path to an input file
     * @throws IOException
     */
    public static String getInFile() throws IOException {

        String path;
        File thisFile;

        System.out.print("Enter the name of the input file path you want to process: ");
        path = input.next();

        thisFile = new File(path);

        while (!thisFile.isFile()) {
            System.out.print("This file does not exist, enter another name: ");
            path = input.next();

            thisFile = new File(path);
        }

        return path;

    }

    /**
     * This method returns a valid path to a nonexistent file that may be made into a new output file
     * @return Returns a String representing a valid location of a possible output file
     * @throws IOException
     */
    public static String getOutFile() throws IOException {

        String path = "";

        System.out.print("Enter the name of the output file path you want to create: ");
        path = input.next();

        File thisfile = new File(path);

        while (thisfile.exists()) {
            System.out.print("This file already exists, enter another name: ");
            path = input.next();

            thisfile = new File(path);
        }

        return path;

    }

    /**
     * Processes an input file based on inPath and creates and writes output of evaluated grades taken from the input file to an output file found at outPath
     * @param inPath The valid location of an input file
     * @param outPath The valid empty location of an output file to be created
     * @throws IOException
     */
    public static void processFile(String inPath, String outPath) throws IOException {
        File inFile, outFileCheck;
        Scanner fileReader;
        String accumulator, thisGrade;
        int highest, lowest, count, total, aCount, bCount, cCount, dCount, fCount;
        int numSets = 0;
        double average;

        inFile = new File(inPath);
        outFileCheck = new File(outPath);

        if (outFileCheck.exists()) {
            outPath = getOutFile();
            outFileCheck = new File(outPath);
        }

        FileWriter wrapped = new FileWriter(outPath);
        PrintWriter printer = new PrintWriter(wrapped);

        fileReader = new Scanner(inFile);

        while (fileReader.hasNextLine()) {
            int temp = fileReader.nextInt();
            highest = 0;
            lowest = 0;
            count = 0;
            total = 0;
            aCount = 0;
            bCount = 0;
            cCount = 0;
            dCount = 0;
            fCount = 0;
            average = 0;

            numSets++;

            accumulator = "";

            while (temp != -1) {
                if (count != 0) {
                    temp = fileReader.nextInt();
                    if (temp == -1) {
                        break;
                    }
                }

                count++;
                total += temp;

                if (highest < temp) {
                    highest = temp;
                }

                if (lowest > temp) {
                    lowest = temp;
                }

                thisGrade = createLetterGrade(temp);

                if (thisGrade.equals("A")) {
                    aCount++;
                } else if (thisGrade.equals("B")) {
                    bCount++;
                } else if (thisGrade.equals("C")) {
                    cCount++;
                } else if (thisGrade.equals("D")) {
                    dCount++;
                } else {
                    fCount++;
                }

                if (count > 0) {
                    average = (double) total / count;
                }

            }

            accumulator += "" +
                    "Set " + numSets + " of grades calculated" +
                    "\nNumber of A's " + aCount +
                    "\nNumber of B's " + bCount +
                    "\nNumber of C's " + cCount +
                    "\nNumber of D's " + dCount +
                    "\nNumber of F's " + fCount +
                    "\nThe high score was: " + highest +
                    "\nThe low score was: " + lowest +
                    "\nThe avg score was: " + average + "\n\n";

            printer.write(accumulator);
        }

        printer.flush();
        printer.close();

    }

    /**
     * Helper method (not part of the directions) I made to easily convert ints to String letter grades
     * @param grade The int to be evaluated and turned into its corresponding letter grade
     * @return Returns a String representing the letter grade corresponding to the parameter int
     */
    public static String createLetterGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

}

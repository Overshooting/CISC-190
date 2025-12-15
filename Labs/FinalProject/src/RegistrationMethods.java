import java.util.Scanner;
import java.io.*;

/**
 * This class handles an input file to create and manipulate arrays of CarOwners
 *
 * @author Alexander Melis, aamel
 * @version 1.0
 * @since 12/14/25
 */

public class RegistrationMethods {

    public static final int REG_MONTH = 4, REG_YEAR = 2025;

    private String inFileName, outFileName;

    /**
     * Uses user input to get the input file and output file paths
     */
    public void setFileNames() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the input file: ");
        inFileName = input.nextLine();

        File inFileCheck = new File(inFileName);
        while (!inFileCheck.exists()) {
            System.out.print("File not found, please enter another file path: ");
            inFileName = input.nextLine();
            inFileCheck = new File(inFileName);
        }

        System.out.print("Enter the name of the file to output to: ");
        outFileName = input.nextLine();

        File outFileCheck = new File(outFileName);
        while (!outFileCheck.exists()) {
            System.out.print("File not found, please enter another file path: ");
            outFileName = input.nextLine();
            outFileCheck = new File(outFileName);
        }
    }

    /**
     * Determines the size of a CarOwner array that will be created from a given input file
     * @return Returns an int representing the necessary size of an array to hold all input file lines
     * @throws IOException Throws IOException if inFileName is not set or does not lead anywhere
     */
    public int getArraySize() throws IOException {
        File inputFile = new File(inFileName);
        Scanner fileInput = new Scanner(inputFile);

        fileInput.nextLine();
        int lineCount = 0;
        while (fileInput.hasNextLine()) {
            lineCount++;
            fileInput.nextLine();
        }

        return lineCount;
    }

    /**
     * Processes the RegistrationDemo's input file to add all listed CarOwners to the given CarOwner array
     * @param inArray The given array to write to
     * @throws IOException Throws IOException if inFileName is not set or doesn't lead anywhere
     */
    public void processTextToArray(CarOwner[] inArray) throws IOException {
        File inputFile = new File(inFileName);
        Scanner fileInput = new Scanner(inputFile);

        fileInput.nextLine();
        int elementNum = 0;
        while (fileInput.hasNextLine()) {
            String[] line = fileInput.nextLine().split(",");

            String firstName = line[1];
            String lastName = line[0];
            String license = line[2];
            String month = line[3];
            String year = line[4];

            CarOwner thisOwner = new CarOwner(firstName, lastName, license, Integer.parseInt(month), Integer.parseInt(year));
            inArray[elementNum] = thisOwner;

            elementNum++;
        }
    }

    /**
     * Prints a given header and CarOwner array to the RegistrationDemo's output file
     * @param inMsg The given header
     * @param inArray The given CarOwner array
     * @throws IOException Throws IOException if outFileName is not set or doesn't lead anywhere
     */
    public void printArrayToFile(String inMsg, CarOwner[] inArray) throws IOException {
        File outputFile = new File(outFileName);
        FileWriter writerWrapper = new FileWriter(outputFile, true);
        PrintWriter output = new PrintWriter(writerWrapper);
        String accumulator = "";

        accumulator += inMsg + "\n";

        for (CarOwner owner : inArray) {
            accumulator += owner.toString() + "\n";
        }

        accumulator += "\n";

        output.write(accumulator);
        output.flush();
        output.close();
    }

    /**
     * Processes a given CarOwner array to check which CarOwners are overdue
     * @param inArray The given CarOwner array
     * @return Returns a CarOwner array containing all CarOwners from inArray that are overdue
     */
    public CarOwner[] flagOverdueOwners(CarOwner[] inArray) {
        int size = 0;
        for (CarOwner thisOwner : inArray) {
            if ((REG_YEAR * 12 + REG_MONTH) - (thisOwner.getYear() * 12 + thisOwner.getMonth()) >= 12) {
                size++;
            }
        }

        CarOwner[] overdueArray = new CarOwner[size];

        int elementNum = 0;

        for (CarOwner thisOwner : inArray) {
            if ((REG_YEAR * 12 + REG_MONTH) - (thisOwner.getYear() * 12 + thisOwner.getMonth()) >= 12) {
                overdueArray[elementNum] = thisOwner;
                elementNum++;
            }
        }

        return overdueArray;
    }

    /**
     * Processes a given CarOwner array to check which CarOwners are 3 or fewer months from overdue
     * @param inArray The given CarOwner array
     * @return Returns a CarOwner array containing all CarOwners from inArray that are 3 or fewer months from overdue
     */
    public CarOwner[] flagAlmostDueOwners(CarOwner[] inArray) {
        int size = 0;
        for (CarOwner thisOwner : inArray) {
            if ((REG_YEAR * 12 + REG_MONTH) - (thisOwner.getYear() * 12 + thisOwner.getMonth()) < 12 && (REG_YEAR * 12 + REG_MONTH) - (thisOwner.getYear() * 12 + thisOwner.getMonth()) >= 10) {
                size++;
            }
        }

        CarOwner[] almostArray = new CarOwner[size];

        int elementNum = 0;

        for (CarOwner thisOwner : inArray) {
            if ((REG_YEAR * 12 + REG_MONTH) - (thisOwner.getYear() * 12 + thisOwner.getMonth()) < 12 && (REG_YEAR * 12 + REG_MONTH) - (thisOwner.getYear() * 12 + thisOwner.getMonth()) >= 10) {
                almostArray[elementNum] = thisOwner;
                elementNum++;
            }
        }

        return almostArray;
    }

    /**
     * Returns the path to the RegistrationDemo's output file
     * @returns a String representing the path to the RegistrationDemo's output file
     */
    public String getOutFileName() {
        return outFileName;
    }
}

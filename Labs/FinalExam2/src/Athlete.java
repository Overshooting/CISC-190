import java.io.*;
import java.util.Scanner;

/**
 * This class extends Person to represent an Athlete, storing an event name, and storing file paths for creating events
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 12/20/25
 */

public class Athlete extends Person {

    public static final int ARRAY_SIZE = 4;

    private String eventName, inputFile, outputFile;

    /**
     * Creates an Athlete with the eventName None and empty file paths
     */
    public Athlete() {
        super();

        eventName = "None";
        inputFile = "";
        outputFile = "";
    }

    /**
     * Creates a new Athlete with the given name and event name and sets the file paths to empty
     * @param inName The given name
     * @param inEventName The given event name
     */
    public Athlete(String inName, String inEventName) {
        super(inName);

        eventName = inEventName;
        inputFile = "";
        outputFile = "";
    }

    /**
     * Sets the input and output file paths from System.in
     */
    public void setFileNames() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the input path: ");
        inputFile = input.nextLine();

        File fileCheck = new File(inputFile);

        while (!fileCheck.exists()) {
            System.out.print("\nFile not found, try again: ");
            inputFile = input.nextLine();
            fileCheck = new File(inputFile);
        }

        System.out.print("\nEnter the name of the output path: ");
        outputFile = input.nextLine();

        fileCheck = new File(outputFile);

        while (!fileCheck.exists()) {
            System.out.print("\nFile not found, try again: ");
            outputFile = input.nextLine();
            fileCheck = new File(outputFile);
        }
    }

    /**
     * Processes a text file into an array of Athletes
     * @return Returns an Array of athletes constructed from the inputFile path
     * @throws IOException Throws an IOException if the inputFile path does not exist
     */
    public Athlete[] csv2Array() throws IOException {
        Athlete[] athletes = new Athlete[ARRAY_SIZE];

        Scanner fileInput = new Scanner(new File(inputFile));

        int thisIndex = 0;
        while (fileInput.hasNextLine()) {
            String[] thisLine = fileInput.nextLine().split(",");

            athletes[thisIndex] = new Athlete(thisLine[0], thisLine[1]);
            thisIndex++;
        }

        return athletes;
    }

    /**
     * Sets the name of the Athlete's event
     * @param inEvent The new event name
     */
    public void setEventName(String inEvent) {
        eventName = inEvent;
    }

    /**
     * Outputs the given array to the outputFile path with the given header
     * @param events The given Athlete[] array
     * @param header The given header
     * @throws IOException Throws IOException if outputFile path does not exist
     */
    public void printArray2File(Athlete[] events, String header) throws IOException {
        PrintWriter fileOutput = new PrintWriter(new FileWriter(new File(outputFile), true));
        String accumulator = header;

        for (Athlete athlete : events) {
            accumulator += "\n" + athlete;
        }

        fileOutput.write(accumulator);
        fileOutput.flush();
        fileOutput.close();
    }

    /**
     * Lists the Athlete's name and event name
     * @return Returns the Athlete's name and event name as a String
     */
    public String toString() {
        return super.toString() + "\t" + eventName;
    }

}

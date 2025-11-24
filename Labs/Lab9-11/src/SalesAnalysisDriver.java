import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class runs the SalesAnalysis class and uses user input to find the input file
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 11/23/25
 */

public class SalesAnalysisDriver {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String filePath;

        System.out.print("Enter the path to the input file: ");
        filePath = input.nextLine();

        File testFilePath = new File(filePath);
        while (!testFilePath.exists()) {
            System.out.print("File not found, please enter a new path: ");
            filePath = input.nextLine();
            testFilePath = new File(filePath);
        }
        System.out.print("\n");

        SalesAnalysis thisSalesAnalysis = new SalesAnalysis(filePath);

        thisSalesAnalysis.processFile();
        thisSalesAnalysis.writeOutput();
    }

    // Labs/Lab9-11/src/SalesData.txt

}

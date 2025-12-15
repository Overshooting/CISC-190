import java.io.IOException;
import java.util.Scanner;

/**
 * This class runs a RegistrationMethods class in order to read the input csv
 *
 * @author Alexander Melis, aamel
 * @version 1.0
 * @since 12/14/25
 */

public class RegistrationDemo {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        RegistrationMethods dmv = new RegistrationMethods();

        dmv.setFileNames();

        int size = dmv.getArraySize();

        CarOwner[] ltstate = new CarOwner[size];

        dmv.processTextToArray(ltstate);

        dmv.printArrayToFile("List of Cart Owners", ltstate);

        CarOwner[] overdue = dmv.flagOverdueOwners(ltstate);

        dmv.printArrayToFile("Owners with Expired Registration", overdue);

        CarOwner[] almostOver = dmv.flagAlmostDueOwners(ltstate);

        dmv.printArrayToFile("Owners with Registration expiring in 3 months or less", almostOver);

        System.out.println("File processing complete, output can be found at " + dmv.getOutFileName());

    }

    // input: Labs/FinalProject/registration.csv
    // output: Labs/FinalProject/finalprojectoutput.txt

}

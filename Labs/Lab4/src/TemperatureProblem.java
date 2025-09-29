import java.util.Scanner;

/**
 * This class takes in a temperature in either Celsius or Fahrenheit and converts it to the opposite
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/27/25
 */

public class TemperatureProblem {

    public static void main(String[] args) {

        boolean run = true;
        double temperature;
        String thisUnit, yesOrNo;

        Scanner input = new Scanner(System.in);

        while (run) {
            System.out.print("Enter a temperature value and unit: ");

            temperature = input.nextDouble();
            thisUnit = input.next().toUpperCase();

            while (!thisUnit.equals("F") && !thisUnit.equals("C")) {
                System.out.print("Enter C or F: ");
                thisUnit = input.next().toUpperCase();
            }

            if (thisUnit.equals("F")) {
                temperature = (temperature - 32.0) * 5.0/9.0;
                thisUnit = "C";
            } else {
                temperature = temperature * 9.0/5.0 + 32.0;
                thisUnit = "F";
            }

            System.out.printf("%.1f " + thisUnit, temperature);

            System.out.println("\nWould you like to submit another temperature to be converted?");
            yesOrNo = input.next().toLowerCase();

            if (yesOrNo.equals("yes")) {
                run = true;
            } else {
                run = false;
            }
        };

    }

}

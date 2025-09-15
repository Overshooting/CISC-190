import java.util.Scanner;

/**
 * This class takes in the cost of a meal and finds the cost of tip, tax and the total based on defined constants TAX and TIP
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/14/2025
 */

public class ProChall13 {
    public static void main (String[] args){
        final double TAX = 0.0675;
        final double TIP = 0.2;

        double meal, total, taxAmount, tipAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter meal amount: $");
        meal = input.nextDouble();

        taxAmount = meal * TAX;
        tipAmount = meal * TIP;
        total = meal + taxAmount + tipAmount;

        System.out.printf("\nThe tax is: $%,.2f", taxAmount);
        System.out.printf("\nThe tip amount is: $%,.2f", tipAmount);
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", total);
    }
}


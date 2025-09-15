import java.util.Scanner;

/**
 * This class calculates the total cost of purchasing a number of stocks for a certain cost per stock when accounting for commission
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/14/2025
 */


public class ProChall15 {

    public static void main(String[] args) {
        final double COMM_RATE = 0.02;

        double pricePerShare, totalCostShares, commission, total;
        int numShares;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of shares purchased: ");
        numShares = input.nextInt();

        System.out.print("Enter price per share: $");
        pricePerShare = input.nextDouble();

        totalCostShares = numShares * pricePerShare;
        commission = totalCostShares * COMM_RATE;
        total = totalCostShares + commission;

        System.out.printf("\nTotal cost of shares are: $%,.2f\nCommission cost is: $ %,.2f\nTotal Cost is: $%,.2f",totalCostShares, commission, total);

    }



}

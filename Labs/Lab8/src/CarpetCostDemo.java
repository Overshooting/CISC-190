import java.util.Scanner;

/**
 * This is the main class for running RoomSize and CarpetCost simulations
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 11/16/25
 */

public class CarpetCostDemo {

    public static void main(String[] args) {
        String name;
        double length, width, costPerSqFt;
        CarpetCost thisRoom;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter room name: ");
        name = input.nextLine();

        System.out.print("Enter room length: ");
        length = input.nextDouble();

        System.out.print("Enter room width: ");
        width = input.nextDouble();

        System.out.print("Enter price per sq ft: ");
        costPerSqFt = input.nextDouble();

        thisRoom = new CarpetCost(new RoomSize(name, length, width), costPerSqFt);
        System.out.println("\n" + thisRoom + "\n");
        String clear = input.nextLine();

        System.out.print("Enter room name: ");
        name = input.nextLine();

        System.out.print("Enter room length: ");
        length = input.nextDouble();

        System.out.print("Enter room width: ");
        width = input.nextDouble();

        System.out.print("Enter price per sq ft: ");
        costPerSqFt = input.nextDouble();

        thisRoom = new CarpetCost(new RoomSize(name, length, width), costPerSqFt);

        System.out.println("\n" + thisRoom);
    }

}

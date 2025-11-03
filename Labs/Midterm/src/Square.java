import java.util.Scanner;

/**
 * This class represents a square, holding a name and a side length
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 10/26/25
 */

public class Square {

    private String name;
    private double side;

    /**
     * Creates a Square with the name "Nothing" and side lengths of 0
     */
    public Square() {
        name = "Nothing";
        side = 0;
    }

    /**
     * Creates a Square with the given name and side lengths
     * @param inName The given name
     * @param inSide The given side lengths
     */
    public Square(String inName, double inSide) {
        name = inName;
        side = inSide;
    }

    /**
     * Helper method for calculating perimeter
     * @return Returns the perimeter as a double
     */
    private double getPerimeter() {
        return side * 4;
    }

    /**
     * Prints the Square's name, side lengths, and perimeter
     */
    public void postOutput() {
        System.out.println("Name: " + name);
        System.out.println("Side Length: " + side);
        System.out.printf("Perimeter: %.2f", getPerimeter());
    }

    /**
     * Reads the Square's name and side lengths from user input
     */
    public void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the Square: ");
        name = input.nextLine();

        System.out.print("Enter the side length: ");
        side = input.nextDouble();
    }

    /**
     * Sets the name of the Square
     * @param inName The new name of the Square
     */
    public void setName(String inName) {
        name = inName;
    }

    /**
     * Sets the side lengths of the Square
     * @param inSide The new side lengths of the Square
     */
    public void setSide(double inSide) {
        side = inSide;
    }

}

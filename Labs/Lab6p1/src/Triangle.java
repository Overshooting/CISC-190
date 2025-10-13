import java.util.Scanner;

/**
 * This class represents a triangle by storing a name, base, and height, and includes methods to both retrieve and set its stored information
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 10/10/25
 */

public class Triangle {

    private String name;
    private double base, height;

    /**
     * Creates a Triangle with the name of "Unknown" and two empty values
     */
    public Triangle() {
        name = "Unknown";
        base = 0;
        height = 0;
    }

    /**
     * Creates a new Triangle with the given name, base, and height
     * @param inName The name of the Triangle
     * @param inBase The base length of the Triangle
     * @param inHeight The height of the Triangle
     */
    public Triangle(String inName, double inBase, double inHeight) {
        name = inName;
        base = inBase;
        height = inHeight;
    }

    /**
     * Method for getting the name of the Triangle
     * @return Returns the name of the Triangle
     */
    public String getName() {
        return name;
    }

    /**
     * Method for setting a new name
     * @param newName The Triangle's new name
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Method for setting the base length of the Triangle
     * @param newBase The Triangle's new name
     */
    public void setBase(double newBase) {
        base = newBase;
    }

    /**
     * Method for setting the height of the Triangle
     * @param newHeight The Triangle's new height
     */
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    /**
     * Method for getting the area of the Triangle
     * @return Returns the area of the Triangle as a double
     */
    private double getArea() {
        return (base * height) / 2.0;
    }

    /**
     * Prompts the user for values in console to set in this Triangle
     */
    public void readInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the triangle's name: ");
        name = input.next();

        System.out.print("What is the triangle's base length: ");
        base = input.nextDouble();

        System.out.print("What is the triangle's height: ");
        height = input.nextDouble();
    }

    /**
     * Prints the Triangles instance fields and area to console
     */
    public void writeOutput() {
        System.out.printf("\nThe triangle's name is: %s " +
                "\nThe triangle's base length is: %.1f " +
                "\nThe triangle's height is: %.1f " +
                "\nThe triangle's area is %.1f", name, base, height, getArea());
    }




}

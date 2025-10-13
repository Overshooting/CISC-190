/**
 * The main test file for the Triangle class
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 10/10/25
 */

public class TriangleDriver
{
    public static void main(String[] args)
    {
        System.out.println("First Triangle");
        System.out.println("--------------");
        Triangle triangle1 = new Triangle();
        triangle1.writeOutput();
        System.out.println("");
        triangle1.setName("Tri1");
        triangle1.setBase(5.0);
        triangle1.setHeight(6.0);
        triangle1.writeOutput();
        System.out.println("\nSecond Triangle");
        System.out.println("--------------");
        Triangle triangle2 = new Triangle("Tri2",7.3,8.3);
        triangle2.writeOutput();
        System.out.println("\nThird Triangle");
        System.out.println("--------------");
        Triangle triangle3 = new Triangle();
        triangle3.readInput();
        System.out.println("");
        triangle3.writeOutput();
    }
}

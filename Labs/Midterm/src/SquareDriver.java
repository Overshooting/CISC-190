/**
 *  SquareDriver for MidTerm Exam
 *
 * @author Rico Cassoni
 * @version 1.0
 * @since 3/21/2023
 */
public class SquareDriver {
    public static void main(String args[]) {
        System.out.println("\nFirst Square");
        System.out.println("------------");
        Square square1 = new Square();
        square1.setName("Square 1");
        square1.setSide(5.432);
        square1.postOutput();
        System.out.println("\n\nSecond Square");
        System.out.println("------------");
        Square square2 = new Square();
        square2.getInput();
        square2.postOutput();
        System.out.println("\n\nThird Square");
        System.out.println("-------------");
        Square square3 = new Square("Square 3", 1.234);
        square3.postOutput();
        System.out.println ("\nCongrats you have completed the 1st half of Java!");
    } // end main
} // end class

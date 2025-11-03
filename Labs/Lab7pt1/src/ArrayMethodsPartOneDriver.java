/**
 * Driver for running and testing ArrayMethodsDemo
 *
 * @author Rico Cassoni, rcassoni@sdccd.edu
 * @version v2.0
 * @since 7/31/2025
 */
public class ArrayMethodsPartOneDriver
{
    public static void main (String[] args) {
        ArrayMethodsPartOne test = new ArrayMethodsPartOne();
        System.out.println("Lab7 Pt1 - Let's get ready to rumble :-)");
        System.out.println("========================================");
        System.out.println("myArray[] has " + test.count() + " elements");
        System.out.println("The sum of all elements in myArray[] is: " + test.sum());
        System.out.printf("The avg of all elements in myArray[] is: %.2f\n", test.average());
        System.out.println("The largest number in myArray[] is: " + test.findMax());
        System.out.println("The index of the largest number in myArray[] is: " + test.findIndexOfMax());
    }
}

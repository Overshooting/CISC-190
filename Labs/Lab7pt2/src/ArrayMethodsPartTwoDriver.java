import java.util.Arrays;
/**
 * Driver for running and testing ArrayMethodsDemo
 *
 * @author Rico Cassoni, rcassoni@sdccd.edu
 * @version v2.0
 * @since 7/31/2025
 */
public class ArrayMethodsPartTwoDriver //change name to Main and rename file to Main.java
{
    public static void main (String[] args){
    ArrayMethodsPartTwo test = new ArrayMethodsPartTwo();
    System.out.println("\n\nLab7 Pt2 - Let's continue to rumble :-)");
    System.out.println("=======================================");
    System.out.println("The last (or right most) index of 8 is: " +
            test.findLast(8));
    System.out.println("The last (or right most) index of 2 is: " +
            test.findLast(2));
    int[] findAll8s = test.findAll(8);
    System.out.print("8s were located in the following indices ");
    test.print(findAll8s);
    int[] myArray = test.copyArray();
    System.out.print("myArray[] is: ");
    test.print(myArray);
    int[] copyOfMyArray = test.copyArray();
    System.out.print("copyOfMyArray[] is: ");
    test.print(copyOfMyArray);
    System.out.println("myArray[] and copyOfMyArray[] are equal: " +
            Arrays.equals(test.getArray(),copyOfMyArray));
    copyOfMyArray = test.reverseArray(copyOfMyArray);
    System.out.print("copyOfMyArray[] reversed is: ");
    test.print(copyOfMyArray);
    System.out.println("myArray[] and copyOfMyArray[] are equal: " +
            Arrays.equals(test.getArray(),copyOfMyArray));
}
}

import java.util.Arrays;

/**
 * This class holds an array and contains methods to analyze it
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 11/1/25
 */

public class ArrayMethodsPartTwo {

    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * Counts the length of the array
     * @return Returns the length of the array as an int
     */
    public int count() {
        int count = 0;

        for (int i : myArray) {
            count++;
        }

        return count;
    }

    /**
     * Sums the array
     * @return Returns the sum of all the values in the array as an int
     */
    public int sum() {
        int total = 0;

        for (int i : myArray) {
            total += i;
        }

        return total;
    }

    /**
     * Averages the array values
     * @return Returns the average of the values in the array as a double
     */
    public double average() {
        if (count() != 0) {
            return (double)sum()/count();
        } else {
            return 0;
        }
    }

    /**
     * Finds the index of the largest nubmer
     * @return Returns the index of the largest number in the array as an int
     */
    public int findIndexOfMax() {
        int highestIndex = 0;

        for (int i = 0; i < count(); i++) {
            if (myArray[i] > myArray[highestIndex]) {
                highestIndex = i;
            }
        }

        return highestIndex;
    }

    /**
     * Finds the largest number in the array
     * @return Returns the largest number in the array as an int
     */
    public int findMax() {
        return myArray[findIndexOfMax()];
    }

    /**
     * Prints the array as its numbers seperated by commas
     * @param inArray The array to be printed
     */
    public void print(int[ ] inArray) {
        System.out.print("{");
        int i;
        for (i = 0; i < inArray.length - 1; i++)
            System.out.print(inArray[i] + ", ");
        if (inArray.length > 0)
            System.out.print(inArray[i]);
        System.out.println("}");
    }

    /**
     * Returns the array
     * @return Returns myArray as an int[]
     */
    public int[] getArray() {
        return myArray;
    }

    /**
     * Returns a copy of the array
     * @return Returns a copy of myArray as an int[]
     */
    public int[] copyArray() {
        return Arrays.copyOf(myArray, count());
    }

    /**
     * Finds the right-most instance of a number in myArray
     * @param key The number to be searched for
     * @return Returns the index of the right-most instance of key, or -1 if key is not present in the array
     */
    public int findLast(int key) {
        for (int i = count()-1; i > 0; i--) {
            if (myArray[i] == key) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Finds all instances of key in myArray and returns their indexes
     * @param key The number to be searched for
     * @return Returns an array containing all indexes of instances of key in myArray
     */
    public int[] findAll(int key) {
        int[] newArray = {};
        int foundCount = 0;

        for (int i : myArray) {
            if (i == key) {
                foundCount++;
            }
        }

        newArray = new int[foundCount];
        int newArrayIndex = 0;

        for (int i = 0; i < count(); i++) {
            if (myArray[i] == key) {
                newArray[newArrayIndex] = i;
                newArrayIndex++;
            }
        }

        return newArray;

    }

    /**
     * Reverses an array
     * @param inArray The array to be reversed
     * @return Returns a new array containing all the values of inArray in reverse order
     */
    public int[] reverseArray(int[] inArray) {
        int[] newArray = new int[inArray.length];

        int newArrayIndex = inArray.length-1;
        for (int i : inArray) {
            newArray[newArrayIndex] = i;
            newArrayIndex--;
        }

        return newArray;
    }

}

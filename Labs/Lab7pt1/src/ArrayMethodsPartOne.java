import java.util.Arrays;

/**
 * This class holds an array and contains methods to analyze it
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 11/1/25
 */

public class ArrayMethodsPartOne {

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

}

import java.util.Scanner;

/**
 * This class takes in a number of seconds and calculates the speed of an object over the course of the given time
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 10/3/25
 */

public class ProChall5  {

    public static final double ACCELERATION = 9.8;

    public static void main(String[] args)
    {
        String accumulator = "Time (secs)     Distance(m)\n===========     ==========";
        int dist;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter how many seconds to compute: ");
        dist = input.nextInt();

        for (int i = 1; i <= dist; i++) {
            int numSpaces = 10 - i / 10;

            accumulator += "\n" + i;

            for (int k = 0; k < numSpaces; k++) {
                accumulator += " ";
            }

            accumulator += "     " + String.format("%.1f", getDistance(i));
        }

        System.out.println(accumulator);

    }

    /**
     * This function returns the distance the object has fallen after a given number of seconds
     * @param seconds The number of seconds that the object has already fallen for
     * @return Returns the distance the object has fallen after the given number of seconds as a double
     */
    public static double getDistance(int seconds) {
        return 0.5 * ACCELERATION * Math.pow(seconds, 2);
    }
}
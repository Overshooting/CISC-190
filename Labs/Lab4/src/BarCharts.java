/**
 * This class generates 3 random numbers 0-999 and then charts them using a bar chart with one star representing 100
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/28/25
 */

public class BarCharts {

    public static void main(String[] args) {

        int num1, num2, num3;
        String num1String, num2String, num3String;

        num1 = (int)(Math.random() * 999);
        num2 = (int)(Math.random() * 999);
        num3 = (int)(Math.random() * 999);

        System.out.println("Number 1 is " + num1 + "\nNumber 2 is " + num2 + "\nNumber 3 is " + num3);

        num1String = createBarString(num1);
        num2String = createBarString(num2);
        num3String = createBarString(num3);

        System.out.println("NUMBER BAR CHART\nNumber 1: " + num1String + "\nNumber 2 " + num2String + "\nNumber 3 " + num3String);
    }

    public static String createBarString(int num) {
        if (num < 100) {
            return "<100 no stars";
        }

        String total = "";

        for (int i = num; i > 100; i-=100) {
            total += "*";
        }

        return total;
    }

}

import java.util.Scanner;

/**
 * This class takes in a date and checks whether it is a valid date that is on the calendar
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/21/2025
 */

public class ValidDate {

    public static void main(String[] args) {

        int day, month, year, maxDays;
        boolean isLeapYear;
        String in;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a date in the form of mm/dd/yyyy: ");
        in = input.nextLine();

        month = Integer.parseInt(in.substring(0, in.indexOf("/")));
        in = in.substring(in.indexOf("/")+1);
        day = Integer.parseInt(in.substring(0, in.indexOf("/")));
        in = in.substring(in.indexOf("/")+1);
        year = Integer.parseInt(in);

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        } else if (month == 2 && isLeapYear) {
            maxDays =  29;
        } else if (month == 2) {
            maxDays =  28;
        } else {
            maxDays =  31;
        }

        if (day < 1 || day > 31) {
            System.out.println(month + "/" + day + "/" + year + " is invalid because it has too many or too little days");
        } else if (month < 1 || month > 12) {
            System.out.println(month + "/" + day + "/" + year + " is invalid because it has too many or too little months");
        } else if (year < 0) {
            System.out.println(month + "/" + day + "/" + year + " is invalid because you cannot have negative years");
        } else if (day > maxDays) {
            System.out.println(month + "/" + day + "/" + year + " is invalid because it has too many days for its month");
        } else {
            System.out.println(month + "/" + day + "/" + year + " is a valid date.");
        }

        input.close();

    }
}

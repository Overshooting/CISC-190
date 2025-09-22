import java.util.Scanner;

/**
 * This class takes the grades of 3 exams and averages them to find gpa, then calculates the letter grade gpa
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 9/20/2025
 */

public class ProChall4
{
    public static void main(String[] args)
    {

        int grade1, grade2, grade3;
        double gpa;
        char grade;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first grade: ");
        grade1 = input.nextInt();

        System.out.print("Enter your second grade: ");
        grade2 = input.nextInt();

        System.out.print("Enter your third grade: ");
        grade3 = input.nextInt();

        gpa = (grade1 + grade2 + grade3) / 3.0;

        if (gpa >= 90) {
            grade = 'A';
        } else if (gpa >= 80) {
            grade = 'B';
        } else if (gpa >= 70) {
            grade = 'C';
        } else if (gpa >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.printf("With an average score of %.1f\nYour grade is: " + grade, gpa);
    }
}
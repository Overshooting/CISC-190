/**
 * This class represents a part-time employee by extending Employee and storing a number of hours worked and an hourly pay rate
 *
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 12/7/25
 */

public class Adjunct extends Employee {

    private double hours, hrRate;

    /**
     * Creates a new Adjunct calling the empty Employee constructor and setting hours and hrRate to 0
     */
    public Adjunct() {
        super();

        hours = 0;
        hrRate = 0;
    }

    /**
     * Creates a new Adjunct calling the Employee constructor with given name, year hired, and employee ID and setting hours and hrRate to their given constants
     * @param inName The given name
     * @param yearHired The given year hired
     * @param id The given Employee ID
     * @param inHours The given hours worked
     * @param inRate The given hourly payrate
     */
    public Adjunct(String inName, int yearHired, String id, double inHours, double inRate) {
        super(inName, yearHired, id);

        hours = inHours;
        hrRate = inRate;
    }

    /**
     * Returns the Adjunct's salary
     * @return Returns the Adjunct's salary as a double
     */
    public double getSalary() {
        return hours * hrRate;
    }

    /**
     * Returns a list of the Adjunct's name, employee ID, year hired, years worked, and formatted hours worked and hourly rate
     * @return Returns a String detailing the FullTime's name, employee ID, year hired, years worked, and formatted hours worked and hourly rate
     */
    public String toString() {
        return super.toString() +
                "Hours: " + hours +
                String.format("\nHourly Rate: %.2f", hrRate) +
                String.format("\nSalary: $%.2f", getSalary());
    }

}

/**
 * This class represents a full-time employee by extending Employee and storing a salary
 *
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 12/7/25
 */

public class FullTime extends Employee {

    private double salary;

    /**
     * Creates a new FullTime calling the empty Employee constructor and setting salary to 0
     */
    public FullTime() {
        super();

        salary = 0;
    }

    /**
     * Creates a new FullTime calling the Employee constructor with given name, year hired, and employee ID and setting salary to the given salary
     * @param inName The given name
     * @param yearHired The given year hired
     * @param id The given Employee ID
     * @param inSalary The given salary
     */
    public FullTime(String inName, int yearHired, String id, double inSalary) {
        super(inName, yearHired, id);

        salary = inSalary;
    }

    /**
     * Returns the FullTime's salary
     * @return The FullTime's salary as a double
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Returns a list of the FullTime's name, employee ID, year hired, years worked, and formatted salary
     * @return Returns a String detailing the FullTime's name, employee ID, year hired, years worked, and formatted salary
     */
    public String toString() {
        return super.toString() +
                String.format("\nSalary: $%.2f", salary);
    }

    /**
     * Sets the FullTime's salary
     * @param inSalary The new salary
     */
    public void setSalary(double inSalary) {
        salary = inSalary;
    }

}

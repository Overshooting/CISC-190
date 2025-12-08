/**
 * This class represents an Employee by extending Person and storing a year of hire and an employee ID
 *
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 12/7/25
 */

public class Employee extends Person {

    private int hireYear;
    private String idNum;

    /**
     * Calls the empty Person constructor for this and sets hireYear and idNum to 0 and "Onboarding" respectively
     */
    public Employee() {
        super();

        hireYear = 0;
        idNum = "Onboarding";
    }

    /**
     * Calls the empty Person constructor for this with a given name and sets hireYear and idNum to the given variables
     * @param inName The given name
     * @param inYear The given year hired
     * @param inId The given employee ID number
     */
    public Employee(String inName, int inYear, String inId) {
        super(inName);

        hireYear = inYear;
        idNum = inId;
    }

    /**
     * Checks whether another object has an equal ID number to this
     * @param o the reference object with which to compare.
     * @return Returns true if the two objects have the same employee ID, false otherwise
     */
    public boolean equals (Object o){
        boolean isEqual = false;
        if (o != null && getClass()==o.getClass()){
            Employee copy = (Employee)o;
            if (idNum.equalsIgnoreCase(copy.idNum))
                isEqual = true;
        }
        return isEqual;
    }

    /**
     * Returns the number of years this has worked
     * @return Returns an int representing the number of years this has worked
     */
    public int getServiceYears() {
        return CURRENT_YEAR - hireYear;
    }

    /**
     * Lists employee's name, ID, year hired, and years worked
     * @return Returns a String detailing the Employee's name, employee ID, years hired, and years worked
     */
    public String toString() {
        return super.toString() +
            "\nID Number: " + idNum +
                "\nYear Hired: " + hireYear +
                "\nService Years: " + getServiceYears();
    }

    /**
     * Returns the year hired
     * @return Returns the year hired as an int
     */
    public int getHireYear() {
        return hireYear;
    }

    /**
     * Returns the ID number
     * @return Returns the employee ID as a String
     */
    public String getidNum() {
        return idNum;
    }

    /**
     * Sets the Employee's year hired
     * @param inHireYear The new year hired
     */
    public void setHireYear(int inHireYear) {
        hireYear = inHireYear;
    }

    /**
     * Sets the Employee's ID number
     * @param inidNum The new employee ID
     */
    public void setIdNum(String inidNum) {
        idNum = inidNum;
    }



}

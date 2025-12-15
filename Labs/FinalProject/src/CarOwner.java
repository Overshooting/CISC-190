/**
 * This class extends Citizen and represents a vehicle owner, holding a license number, and date of license
 *
 * @author Alexander Melis, aamel
 * @version 1.0
 * @since 12/14/25
 */

public class CarOwner extends Citizen {

    private String license;
    private int month, year;

    /**
     * Creates a new CarOwner with the empty Citizen constructor, then sets License to "Not Assigned" and the month and year to 0
     */
    public CarOwner() {
        super();

        license = "Not Assigned";
        month = 0;
        year = 0;
    }

    /**
     * Creates a new CarOwner with the given names, license number, month and year
     * @param inFirstName The given first name
     * @param inLastName The given last name
     * @param inLicense The given license number
     * @param inMonth The given month
     * @param inYear The given year
     */
    public CarOwner(String inFirstName, String inLastName, String inLicense, int inMonth, int inYear) {
        super(inFirstName, inLastName);

        license = inLicense;
        month = inMonth;
        year = inYear;
    }

    /**
     * Sets the Citizen's license number
     * @param newLicense The new license number
     */
    public void setLicense(String newLicense) {
        license = newLicense;
    }

    /**
     * Gets the Citizen's license number
     * @return Returns a String representing the Citizen's license number
     */
    public String getLicense() {
        return license;
    }

    /**
     * Sets the Citizen's license month
     * @param newMonth The new license month
     */
    public void setMonth(int newMonth) {
        month = newMonth;
    }

    /**
     * Gets the Citizen's license month
     * @return Returns a String representing the Citizen's license month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the Citizen's license year
     * @param newYear The new license year
     */
    public void setYear(int newYear) {
        year = newYear;
    }

    /**
     * Gets the Citizen's license year
     * @return Returns a String representing the Citizen's license year
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns a list of the Citizen's name, license number, and license date
     * @return Returns a String listing the Citizen's name, license number, and license date
     */
    public String toString() {
        return super.toString() + "\t" + license + "\t" + month + "/" + year;
    }
}

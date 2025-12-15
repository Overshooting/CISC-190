/**
 * This class represents a person, storing their first and last name
 *
 * @author Alexander Melis, aamel
 * @version 1.0
 * @since 12/14/25
 */


public class Citizen {

    private String firstName, lastName;

    /**
     * Creates a Citizen with the name "No Name"
     */
    public Citizen() {
        firstName = "No Name";
        lastName = "";
    }

    /**
     * Createsa a Citizen with the given first and last names
     * @param inFirstName The given first name
     * @param inLastName The given last name
     */
    public Citizen(String inFirstName, String inLastName) {
        firstName = inFirstName;
        lastName = inLastName;
    }

    /**
     * Returns the Citizen's first name
     * @return A String representing the Citizen's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the Citizen's last name
     * @return A String representing the Citizen's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the Citizen's first name
     * @param newFirstName The new first name
     */
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    /**
     * Sets the Citizen's last name
     * @param newLastName The new last name
     */
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    /**
     * Lists the Citizen's first and last names
     * @return Returns a String listing the Citizen's first and last names
     */
    public String toString() {
        return firstName + " " + lastName;
    }

}

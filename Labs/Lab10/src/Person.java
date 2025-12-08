/**
 * This class represents a person with a name and stores the current year
 *
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 12/7/25
 */

public class Person {

    public static final int CURRENT_YEAR = 2025;

    private String name;

    /**
     * Creates a Person with the name "No Name Yet"
     */
    public Person() {
        name = "No Name Yet";
    }

    /**
     * Creates a Person with the given name
     * @param inName The given name
     */
    public Person(String inName) {
        name = inName;
    }

    /**
     * Sets the name of the Person
     * @param inName The new name for the Person
     */
    public void setName(String inName) {
        name = inName;
    }

    /**
     * Returns the name of the Person
     * @return Returns the name of the Person as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Lists the name of the Person
     * @return Returns a String detailing the Name of the Person
     */
    public String toString() {
        return "Name: " + name;
    }

}

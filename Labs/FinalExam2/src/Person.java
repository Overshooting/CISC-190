/**
 * This class represents a person and holds a name
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 12/20/25
 */

public class Person {

    private String name;

    /**
     * Creates a new Person with the name TBD
     */
    public Person() {
        name = "TBD";
    }

    /**
     * Creates a new Person with the given name
     * @param inName The given name
     */
    public Person(String inName) {
        name = inName;
    }

    /**
     * Sets the Person's name to the given name
     * @param inName The given name
     */
    public void setName(String inName) {
        name = inName;
    }

    /**
     * Returns the Person's name as a String
     * @return Returns the Person's name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Lists the Person's name
     * @return Lists the Person's name as a String
     */
    public String toString() {
        return "Name: " + name;
    }

}

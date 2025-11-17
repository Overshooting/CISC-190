/**
 * This is a class meant to represent a 2D room with a name and dimensions
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 11/16/25
 */

public class RoomSize {

    private String name;
    private double length, width;

    /**
     * Constructs a RoomSize with the given name, length, and width
     * @param inName The given name
     * @param inLen The given length
     * @param inWidth The given width
     */
    public RoomSize(String inName, double inLen, double inWidth) {
        name = inName;
        length = inLen;
        width = inWidth;
    }

    /**
     * Copies the instance variables of a given RoomSize
     * @param object2 The given RoomSize
     */
    public RoomSize(RoomSize object2) {
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }

    /**
     * Gets the area of the RoomSize
     * @return Returns the area as a double
     */
    public double getArea() {
        return width * length;
    }

    /**
     * Lists the RoomSize's information
     * @return Returns a String listing the RoomSize's instance variables and area
     */
    public String toString() {
        return "Room Name: " + name +
                "\nLength: " + length +
                "\nWidth: " + width +
                "\nArea: " + getArea();
    }



}

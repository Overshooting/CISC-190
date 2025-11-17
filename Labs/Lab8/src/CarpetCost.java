/**
 * This is a class that represents a room's cost by holding a RoomSize and a cost per square foot
 *
 * @author Alexander Melis, aamelis@gmail.com
 * @version 1.0
 * @since 11/16/25
 */

public class CarpetCost {

    private RoomSize size;
    private double costPerSqFt;

    /**
     * Creates a new CarpetCost with the given RoomSize and cost per square foot
     * @param inSize The given RoomSize
     * @param inCost The given cost per square foot
     */
    public CarpetCost(RoomSize inSize, double inCost) {
        size = inSize;
        costPerSqFt = inCost;
    }

    /**
     * Gets the cost of the room
     * @return Returns the cost of the whole room as a double
     */
    public double getCost() {
        return costPerSqFt * size.getArea();
    }

    /**
     * Lists the CarpetCost as a String
     * @return Returns a String listing all of this CarpetCost's information
     */
    public String toString() {
        return size.toString() +
                "\nThe cost per sq ft is: $" + costPerSqFt +
                "\nThe total cost is: " + String.format("$%.2f", getCost());

    }

}

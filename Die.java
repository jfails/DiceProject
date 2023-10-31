import java.util.Random;

/**
 * This is a representation of a single, multi-sided die.
 * @author Jerry Fails
 */
public class Die implements Rollable
{
    // CONSTANT
    public static final int DEFAULT_NUM_SIDES = 6;
    private static int nextID = 0;
    
    // FIELDS
    private int faceValue;
    private int numberOfSides;
    private int myID;

    // CONSTRUCTORS
    /**
     * Creates a die object with the DEFAULT_NUM_SIDES and initial facevalue of 1.
     */
    public Die()
    {
        numberOfSides = DEFAULT_NUM_SIDES;
        this.roll();
        this.myID = nextID++;
    }

    /**
     * Creates a die object with the specified number of sides.
     * @param numberOfSides the number of sides of this die
     */
    public Die(int numberOfSides)
    {
        this.numberOfSides = numberOfSides;
        this.roll();
        this.myID = nextID++;
    }

    // METHODS
    /**
     * Rolls the die changing the face value to a random number within the number of sides.
     * @return the new face value
     */
    public int roll()
    {
        Random r = new Random();
        faceValue = r.nextInt(numberOfSides) + 1;
        return faceValue;
    }

    /**
     * 
     * @return the face value
     */
    public int getFaceValue()
    {
        return faceValue;
    }

    /**
     * Sets the face value
     * @param faceValue the new face value
     */
    public void setFaceValue(int faceValue)
    {
        this.faceValue = faceValue;
    }

    /**
     * Returns a string representation of this Die object.
     * @return a string representation of this Die object.
     */
    public String toString()
    {
        return "Die (id=" + myID + ", numSides=" + numberOfSides + "): " + faceValue;
    }

}

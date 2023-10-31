import java.util.ArrayList;

/**
 * Represents a cup of dice to play yahtzee with.
 * @author Jerry Fails
 */
public class Yahtzee implements Rollable
{
    public static final int NUM_DICE = 5;

    // FIELDS
    private ArrayList<Die> dice;
    
    
    // CONSTRUCTORS
    /**
     * Creates a Yahtzee cup object with the appropriate number of dice (NUM_DICE).
     */
    public Yahtzee()
    {
        // creates collection
        this.dice = new ArrayList<Die>();
        
        // create die objects and add them
        for (int i = 0; i < NUM_DICE; i++)
        {
            dice.add(new Die());
        }
    }


    // METHODS
    
    public String toString()
    {
        String str = "Yahtzee: ";
        int sum = 0;

        for (Die d : dice)
        {
            sum += d.getFaceValue();
            str += d.getFaceValue() + " ";
        }
        str += "(sum="+sum+")";

        return str;
    }


    @Override
    /**
     * Rolls the dice and returns their sum.
     * @return the sum of the face values
     */
    public int roll() 
    {
        int sum = 0;
        for (Die d : dice)
        {
            sum += d.roll();
        }
        return sum;
    }

    public boolean isYahtzee()
    {
        // get the first die face value
        int faceValue = dice.get(0).getFaceValue();

        // check it against all other die
        for (int i = 1; i < dice.size(); i++)
        {
            if (faceValue != dice.get(i).getFaceValue())
            {
                return false;
            }
        }

        // if done checking and all the same return true
        return true;
    }
}

public class DieDriver 
{
    public static void main(String[] args) {
        
        final int NUM_TRIALS = 10000;

        long rollsum = 0;
        for (int i = 0; i < NUM_TRIALS; i++)
        {

            int numrolls = 0;
            Yahtzee ycup = new Yahtzee();
            while (!ycup.isYahtzee())
            {
                ycup.roll();
                numrolls++;
                //System.out.println(numrolls + ": " + ycup);
            }
            rollsum += numrolls;
        }

        System.out.println("Average: " + (double)rollsum/NUM_TRIALS);
    }    
}

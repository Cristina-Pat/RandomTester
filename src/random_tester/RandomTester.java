package random_tester;

import java.util.Random;

public class RandomTester {
	
	// instance variables
    private Random random;

    /**
     * Constructor for objects of class RamdomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        random = new Random();
    }
		
	    /**
	     * Describe the method
	     *
	     */
	    public void printOneRandom()
	    {
	       System.out.println(random.nextInt());
	       System.out.println();
	    }
	    
	    /**
	     * Describe the method
	     *
	     * @param 
	     */
	    public void printMultiRandom(int howMany)
	    {   
	        int i = 1;
	        while(i < howMany+1) {
	            System.out.println("The "+ i + " random number is: " + random.nextInt());
	            System.out.println();
	            i++;
	        }
	      }

	    public void trowDie()
	    {
	       System.out.println(1 + random.nextInt(6-1));
	       System.out.println();
	    }
	}

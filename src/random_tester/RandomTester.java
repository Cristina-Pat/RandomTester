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
	    
	    /**
	     * Generate a random response.
	     * 
	     * @return A random response: "no", "yes" or "maybe".
	     */  
	    
	    public void getRespons()
	    {
	       System.out.println("Shall I respond to your question?");
	       
	       int respons = random.nextInt(3);
	       
	       if(respons == 0) {
	           System.out.println("no");
	        }
	       else if(respons == 1) {
	           System.out.println("yes");
	       }
	       else{
	           System.out.println("maybe"); 
	        }
	       
	       System.out.println();
	    }
	    
	     /**
	     * Generate a random number in range mimimum to maximum inclusiv. 
	     * 
	     * @param min The lower limit of random number to generate.
	     * @param max The upper limit of random number to generate (minus min).
	     * 
	     * @return A random int between min and max inclusiv.
	     */
	    public void randomMinMax(int min, int max)
	    {
	        System.out.println(random.nextInt(max-min) + min);
	    }  
	}

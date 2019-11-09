public class GCD {
	/**
	 * This method takes two positive integers and finds their gcd using 
	 * Euclid's algorithm
	 * @param a
	 * @param b
	 * @return
	 */
    /**
     * In the following recursive method, after the first cycle of 
     * execution of the program, value of a is b and 
     * value of b is a%b. We will continue this til we input b is 0. WHich means 
     * perfect division has happened and you now have the greatest common divisor   */
	public int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b); //recursive function
	}	
	
	public static void main(String[] args) {
        System.out.println(new GCD().gcd(25, 10)); //or you can create a 
        //variable, call the function and print that.  and print that// should print 5
	}
}

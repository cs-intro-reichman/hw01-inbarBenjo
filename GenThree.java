/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int min = Math.min(a,b); 
        int max = Math.max(a,b);

        int randnum1 = (int) ((Math.random() * (max - min)) + min);
        int randnum2 = (int) ((Math.random() * (max - min)) + min);
        int randnum3 = (int) ((Math.random() * (max - min)) + min);
        System.out.println(randnum1);
        System.out.println(randnum2);
        System.out.println(randnum3);
        int minrand  = Math.min(randnum1,randnum2);
        System.out.println("The minimal generated number was " +  Math.min(minrand,randnum3));
	}
}

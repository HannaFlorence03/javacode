package assign_part2;

public class Assignment_29 {

	public static void main(String args[]) {
		// Use of signum() method
		double x = 10.4556, y = -23.34789;

		// Use of round() method
		double r1 = Math.round(x);
		System.out.println("Round off 10.4556  = " + r1);

		double r2 = Math.round(y);
		System.out.println("Round off 23.34789 = " + r2);
		System.out.println("");

		// Use of max() method on r1 and r2
		double m = Math.max(r1, r2);
		System.out.println("Max b/w r1 and r2 = " + r2);
	}
}

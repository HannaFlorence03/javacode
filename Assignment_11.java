package assign_part1;

public class Assignment_11 {

	public static void main(String[] args) {
		boolean condition1 = true;
        boolean condition2 = false;

        // Using AND with NOT operator
        if (condition1 && !condition2) {
            System.out.println("Condition1 is true and Condition2 is false");
        } else {
            System.out.println("Either Condition1 is false or Condition2 is true");
        }	
	}
}

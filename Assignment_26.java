package assign_part2;

public class Assignment_26 {

	// Static global variable
	static int staticVar = 10;

	// Non-static global variable (instance variable)
	int instanceVar = 20;

	public void updateVariables() {
		// Local variable
		int localVar = 30;

		// Updating the static variable
		staticVar += 5;

		// Updating the instance variable
		instanceVar += 10;

		// Updating the local variable
		localVar += 15;

		// Printing the updated values
		System.out.println("Updated static variable: " + staticVar);
		System.out.println("Updated instance variable: " + instanceVar);
		System.out.println("Updated local variable: " + localVar);
	}

	public static void main(String[] args) {
		Assignment_26 example = new Assignment_26();
		example.updateVariables();
	}
}

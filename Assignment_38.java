package assign_part2;

import java.util.Scanner;

public class Assignment_38 {

	public static void main(String[] args) {

		// creates an object of Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name: ");

		String name = input.nextLine();

		System.out.println("My name is " + name);

		System.out.println("Enter your age ");

		// takes input from the keyboard
		int data1 = input.nextInt();
		// prints the age
		System.out.println("My age is " + data1);

		System.out.println("Are you an Indian (true/false):");

		// Check if the next token is a boolean
		try {
			if (input.hasNextBoolean()) {
				boolean value = input.nextBoolean();
				System.out.println("You entered: " + value);
			} else {
				System.out.println("The input is not a boolean value.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		input.close();
	}
}

package assign_part2;

import java.util.Scanner;

public class Assignment_40 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double radius = scanner.nextDouble();

		// Calculate the area
		double area = Math.PI * radius * radius;

		// Display the result
		System.out.println("The area of the circle is: " + area);
	}
}

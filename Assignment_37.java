package assign_part2;

import java.util.Scanner;

public class Assignment_37 {
	static void add(int a, int b) {

	}

	static void subtract(int a, int b) {

	}

	static void division(int a, int b) {

	}

	static void modulus(int a, int b) {

	}

	public static void main(String[] args) {

		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the vAlue of A: " + " ");
		a = s.nextInt();

		System.out.print("Enter the vAlue of b: " + " ");
		b = s.nextInt();

		System.out.println("The Addition of two numbers are :" + (a + b));
		System.out.println("The Subtraction of two numbers are :" + (a - b));
		System.out.println("The Mutiplication of two numbers are :" + (a * b));
		System.out.println("The Division of two numbers are :" + (a / b));
		System.out.println("The Modulus of two numbers are :" + (a % b));

	}

}

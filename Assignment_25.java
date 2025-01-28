package assign_part2;

public class Assignment_25 {

	public Assignment_25() {

		System.out.println("Am the First Constructor ");
	}

	public Assignment_25(int a, double b) {
		System.out.println("Am the Second Constructor ");
	}

	static String Dog_name(String s) {
		// System.out.println(" My Dogs name is Marley");
		return s;
	}

	static int Dog_age(int years) {

		return years;
	}

	public static void main(String[] args) {
		System.out.println("My Dogs name is:" + " " + Dog_name("marley"));
		System.out.println("My Dogs age is:" + " " + Dog_age(8));

		Assignment_25 f = new Assignment_25();
		Assignment_25 s = new Assignment_25(23, 56);
	}
}

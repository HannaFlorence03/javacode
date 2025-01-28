package assign_part2;

public class Assignment_30 extends Thread {

	public void run() {
		System.out.println("This code is running in a thread");
	}

	public static void main(String[] args) {
		Assignment_30 thread = new Assignment_30();
		thread.start(); // Start the thread
		System.out.println("This code is outside of the thread");
	}
}

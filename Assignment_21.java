package assign_part2;



public class Assignment_21 {

	void add() {
		System.out.println("You are calling a Non static members");// Static method 
		}
		
		static void addition() {
		System.out.println("You are calling a Static members");	//non static method
		}
		
		private Assignment_21() {//  private constructor
		System.out.println("You are calling a Constructor vaule");	
		}
		
		public static void main(String[] args) {
			addition();
			Assignment_21 a=new Assignment_21();
			a.add();
		}
	}

	

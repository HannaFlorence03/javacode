package assign_part2;

public class Assignment_23 {
			String language;

		  // constructor with no parameter
		  void Main() {
		    this.language = "Java";
		  }

		  // constructor with a single parameter
		  void Main(String language) {
		    this.language = language;
		  }

		  public void getName() {
		    System.out.println("Programming Language: " + this.language);
		  }

		  public static void main(String[] args) {

		    // call constructor with no parameter
			  Assignment_23 obj1 = new Assignment_23();

		    // call constructor with a single parameter
			  Assignment_23 obj2 = new Assignment_23();

		    obj1.getName();
		    obj2.getName();
		  }
		}


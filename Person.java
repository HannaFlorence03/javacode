package assign_part2;

public class Person {

	public Person() {
		System.out.println("Am Empty Constructor");
		}
	Person(String name){
		System.out.println("Am Parametrised Constructor with one argument");
	}	
	
	Person(String sname, int rollno){
		//System.out.println("Am Parametrised Constructor with two argument ");
	}	
	
	Person(String s, int id,String address ){
		System.out.println("Am Parametrised Constructor with three argument");
	}
	public static void main(String[] args) {
		Person P= new Person();
		Person S= new Person();
		Person n= new Person();
		Person a= new Person();
	}
	}
	

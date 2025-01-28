package assign_part2;

import java.util.Scanner;

public class Assignment_39 {

	public Assignment_39() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	 {
			// area of the circle is pi *r*r 
			
			int b,h,area;	
			
		Scanner s=new Scanner(System.in);
		System.out.print ("Enter the breadth of the triangle"+" ");
		b=s.nextInt();

		
		System.out.print ("Enter the height of the triangle"+" ");
		h=s.nextInt();

		area= (b*h)/2;
		System.out.println("The Area of then triangle is :"+" " + area);
	 }

	}

}

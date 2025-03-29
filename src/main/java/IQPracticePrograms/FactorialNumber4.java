package IQPracticePrograms;

import java.util.Scanner;

public class FactorialNumber4 {

	public static void main(String[] args) {


		int no, fact =1;
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter any number");
		no = s.nextInt();
		
		for(int i=1;i<=no;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial number is :" +fact);
	}

}

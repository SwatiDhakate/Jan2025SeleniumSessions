package IQPracticePrograms;

import java.util.Scanner;

public class OddEven4 {

	public static void main(String[] args) {

		int no;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		
		no = s.nextInt();
		if(no%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}

}

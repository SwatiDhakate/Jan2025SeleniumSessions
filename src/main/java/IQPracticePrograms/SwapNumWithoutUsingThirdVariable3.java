package IQPracticePrograms;

import java.util.Scanner;

public class SwapNumWithoutUsingThirdVariable3 {

	public static void main(String[] args) {


		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value for a");
		a = s.nextInt();
		System.out.println("Enter value for b");
		b = s.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Value of a:" +a);
		System.out.println("Value of b:" +b);
	}

}

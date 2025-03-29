package IQPracticePrograms;

import java.util.Scanner;

public class NumOfDigits2 {

	public static void main(String[] args) {

		int no, count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		no=s.nextInt();
		
		while(no!=0) {
			no=no/10;
			++count;
		}
		System.out.println("No digits:" +count);
	}

}

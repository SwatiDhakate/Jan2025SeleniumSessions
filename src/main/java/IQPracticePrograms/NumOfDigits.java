package IQPracticePrograms;

import java.util.Scanner;

public class NumOfDigits {

	public static void main(String[] args) {

		int no,count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter nummber");
		no=s.nextInt();
		
		while(no!=0) {
			no = no/10;
			++count;
		}
		System.out.println("No of digits:" +count);
	}

}

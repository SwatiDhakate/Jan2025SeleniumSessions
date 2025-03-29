package IQPracticePrograms;

import java.util.Scanner;

public class FibonacciSeries2 {

	public static void main(String[] args) {

		int no,i,first=0,second=1,next;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		no = s.nextInt();
		System.out.println("Fibaonacci series:");
		
		for(i=0;i<no;i++) {
			System.out.println(first);
			next= first+second;
			first=second;
			second=next;
		}
		
	}

}

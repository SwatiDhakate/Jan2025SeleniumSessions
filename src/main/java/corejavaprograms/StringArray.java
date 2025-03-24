package corejavaprograms;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {


		String emp[] = new String[3];
		emp[0]="Joe";
		emp[1]="Pete";
		emp[2]="Lavi";
		
		System.out.println("Total emp :" +emp.length);
		System.out.println(Arrays.toString(emp));
	}

}

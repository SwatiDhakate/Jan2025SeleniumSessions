package corejavaprograms;

import java.util.Arrays;

public class ArrayWithoutUsingLoop {

	public static void main(String[] args) {


		int a[] = new int [4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		//System.out.println(a);//this will give garbage value
		
		System.out.println(Arrays.toString(a));
	}

}

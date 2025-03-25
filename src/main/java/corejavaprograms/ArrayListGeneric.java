package corejavaprograms;

import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {


		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		//a.add("Test");
		System.out.println(a.size());
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}

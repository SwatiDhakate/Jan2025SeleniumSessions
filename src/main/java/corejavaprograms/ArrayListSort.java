package corejavaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {


		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(200);
		al.add(30);
		al.add(2);
		al.add(3555);
		al.add(564);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
	}

}

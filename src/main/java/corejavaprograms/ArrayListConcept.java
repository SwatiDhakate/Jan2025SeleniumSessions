package corejavaprograms;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		
		ar.add("test");
		System.out.println(ar.get(0));
		
		ar.add(true);
		ar.add('t');
		
		System.out.println(ar.size());
	}

}

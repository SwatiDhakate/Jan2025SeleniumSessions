package corejavaprograms;

import java.util.ArrayList;

public class ArrayUsingObject {

	public static void main(String[] args) {


		ArrayList<Object> ao = new ArrayList<Object>();
		
		ao.add("Tom");
		ao.add(true);
		ao.add('A');
		ao.add(2000);
		ao.add("Wood");
		
		System.out.println(ao.size());
		
		for(Object e : ao) {
			System.out.println(e);
		}
		System.out.println("-------------------");
		System.out.println(ao);
	}

}

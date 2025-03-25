package corejavaprograms;

import java.util.ArrayList;

public class ArrayListUsingString {

	public static void main(String[] args) {

		ArrayList<String> as = new ArrayList<String>();
		as.add("Tom");
		as.add("Pete");
		as.add("Joe");
		
		System.out.println(as.size());
		System.out.println(as);
		
		for(int i=0; i<as.size();i++)
		{
			System.out.println(as.get(i));
		}
	}

}

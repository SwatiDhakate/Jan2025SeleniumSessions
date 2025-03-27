package corejavaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUsingStringCopies {

	public static void main(String[] args) {


		ArrayList<String> as = new ArrayList<String>(Collections.nCopies(5, "test"));
		
		System.out.println(as.size());
		System.out.println(as);
	}

}

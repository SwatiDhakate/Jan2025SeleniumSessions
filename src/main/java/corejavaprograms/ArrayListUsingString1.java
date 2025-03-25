package corejavaprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUsingString1 {

	public static void main(String[] args) {


		ArrayList<String> as = new ArrayList<String>(Arrays.asList("Tom","Pete","Joe"));
		System.out.println(as.size());
		System.out.println(as);
		
		as.add(0, "Alisa");
		System.out.println(as);
		as.add(9, "Alexa");
		System.out.println(as);
	}

}

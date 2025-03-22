package corejavaprograms;

public class IncreDcre {

	public static void main(String[] args) {

		int i=19, j=29;
		int k= i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
		
		System.out.println("i" +i);
		System.out.println("j" +j);
		
		System.out.println("k" +k);
	}

}

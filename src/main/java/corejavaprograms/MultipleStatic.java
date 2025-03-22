package corejavaprograms;

public class MultipleStatic {
	
	static {
		System.out.println("Launch Browser");
	}

	public static void main(String[] args) {

		System.out.println("Testing");
	}
	
	static {
		System.out.println("Close Browser");
	}

}

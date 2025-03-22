package corejavaprograms;

public class SwitchCase {

	public static void main(String[] args) {

		String browser = "safari";
		
		switch(browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
			
		case "firefox":
			System.out.println("Launch firefox");
			break;
			
		case "IE":
			System.out.println("Launch IE");
			break;
			
		default :
			System.out.println("Please launch correct browser");
			break;
		
		}
	}

}

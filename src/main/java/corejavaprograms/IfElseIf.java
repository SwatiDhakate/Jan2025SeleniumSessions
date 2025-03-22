package corejavaprograms;

public class IfElseIf {

	public static void main(String[] args) {

		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome");
		}
		
		else if(browser.equals("IE")){
			System.out.println("Launch IE");
		}
		else if(browser.equals("Firefox")){
			System.out.println("Launch firefox");
			
		}
		else {
			System.out.println("Please pass correct browser");
		}
		
	}

}

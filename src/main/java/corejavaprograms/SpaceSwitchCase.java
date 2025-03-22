package corejavaprograms;

public class SpaceSwitchCase {

	public static void main(String[] args) {


		String envName = " PROD";
		
		switch(envName.toLowerCase().trim()) {
		
		case "qa":
			System.out.println("On qa");
			break;
		case "stage":
			System.out.println("On stage");
			break;
		case "prod":
			System.out.println("On prod");
			break;
		default :
			System.out.println("Please mention correct env");
			break;
		}
		
	}

}

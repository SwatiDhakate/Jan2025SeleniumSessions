package corejavaprograms;

public class StringArrayUsingForEach {

	public static void main(String[] args) {


		String emp[]= new String[5];
		emp[0]="Riya";
		emp[1]="Tia";
		emp[2]="Robin";
		emp[3]="Tom";
		emp[4]="Joe";
		
		for(String e : emp) {
			System.out.println(e);
			if(e.equals("io")) {
				System.out.println("He is working as P");
				break;
			}
		}
	}

}

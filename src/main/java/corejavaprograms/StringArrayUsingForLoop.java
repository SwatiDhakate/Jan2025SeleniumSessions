package corejavaprograms;

public class StringArrayUsingForLoop {

	public static void main(String[] args) {

		String emp[] = new String[3];
		emp[0]="Jack";
		emp[1]="Joe";
		emp[2]="David";
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i]);
			if(emp[i].equals("David")) {
				System.out.println("David's salary is : " +2000);
				break;
			}
		}
		
	}

}

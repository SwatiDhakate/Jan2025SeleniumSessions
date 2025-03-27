package corejavaprograms;

public class User {
	String name;
	int age;

	public static void main(String[] args) {

		User u1 = new User();
		u1.name = "Joe";
		u1.age = 25;
		
		User u2 = new User();
		u2.name = "Tom";
		u2.age = 31;
		
		System.out.println(u1.name + " " + u1.age);
		System.out.println(u2.name + " " + u2.age);
		
		System.out.println("----------------------------");
		
		u2=u1;
		System.out.println(u1.name + " " + u1.age);
		System.out.println(u2.name + " " + u2.age);
	}

}

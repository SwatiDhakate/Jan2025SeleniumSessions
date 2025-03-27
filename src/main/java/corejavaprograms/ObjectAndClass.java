package corejavaprograms;

public class ObjectAndClass {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		ObjectAndClass o = new ObjectAndClass();
		o.name = "Joe";
		o.age = 25;
		o.city = "Pune";
		
		System.out.println(o.name + " " + o.age + " " + o.city);
		
	}

}

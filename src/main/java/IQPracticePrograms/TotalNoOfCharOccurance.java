package IQPracticePrograms;

public class TotalNoOfCharOccurance {

	public static void main(String[] args) {

		String s = "Java is java again java again";
		char c = 'g';
		int count = s.length()-s.replace("g", " ").length();
		
		System.out.println("No. of occurance of 'g' in " +s  +count);
	}

}

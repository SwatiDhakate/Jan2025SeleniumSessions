package IQPracticePrograms;

public class TotalNoOfCharOccurance2 {

	public static void main(String[] args) {

		String str = "My name is swati dhakate";
		String rev = " ";
		int len = str.length();
		
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			rev = ch + rev;
		}
		System.out.println(rev);
	}

}

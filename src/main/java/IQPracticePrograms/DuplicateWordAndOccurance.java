package IQPracticePrograms;

public class DuplicateWordAndOccurance {

	public static void main(String[] args) {

		String str = "spring is beautiful and so is winter";
		String word = "is";
		String temp[] = str.split(" ");
		int count =0;
		
		for(int i=0;i<temp.length;i++) {
			if(word.equals(temp[i]));
			count++;
		}
		System.out.println("The string is : " +str);
		System.out.println("The word " + word+ " occurs " +count+ " times in string");
	}

}

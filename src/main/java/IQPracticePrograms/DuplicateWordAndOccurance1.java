package IQPracticePrograms;

public class DuplicateWordAndOccurance1 {

	public static void main(String[] args) {

		String str = "Spring is beautiful but so is winter";
		String word = "is";
		String temp[] = str.split(" ");
		int count =0;
		
		for(int i=0;i<temp.length;i++) {
			if(word.equals(temp[i])) 
			count++;
		}
		System.out.println("The string is " +str);
		System.out.println("The word " +word+ " occurs " +count+ " times in string");
	}

}

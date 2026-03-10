package Interviewqutions;

public class Checkvovels {

	public static void main(String[] args) {

		String str ="java programing";
		int counter=0;
		 
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch=='a' || ch=='e'||ch=='i'||ch=='u') {
			counter++;
			System.out.println(ch);
			}
		}
	}

}

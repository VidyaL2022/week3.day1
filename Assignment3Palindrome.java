package week3.day1;

public class Assignment3Palindrome {

	public static void main(String[] args) {
	 String str = "sir";
	 @SuppressWarnings("unused")
	String reverse = "";
	 
	 @SuppressWarnings("unused")
	int strlength = str.length();
	 for(int i = strlength-1;i>=0;--i) {
		 reverse = reverse + str.charAt(i);
	 }
		 
	 if(str.toLowerCase().equalsIgnoreCase(reverse.toLowerCase()))
		 System.out.println(str + " is a Palindrome");
	 else {
		 System.out.println(str + " is not a Palindrome");
	 }
		 
	}
	}


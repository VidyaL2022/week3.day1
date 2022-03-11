package week3.day1;
import java.util.Arrays;
public class Assignment3Anagram {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s1 = "Stops";
		String s2 = "potss";
		int len1 = s1.length();
		int len2 = s2.length();
		if ( len1 != len2) {
			System.out.println("Length is not same");
		}
		else
			System.out.println("Length is same");

	char[] charArray = s1.toLowerCase().toCharArray();
	char[] charArray2 = s2.toLowerCase().toCharArray();
	Arrays.sort(charArray);
	Arrays.sort(charArray2);
	boolean result = Arrays.equals(charArray, charArray2);
	
	 if(result) {
	        System.out.println(s1 + " and " + s2 + " are anagram.");
	      }
	      else {
	        System.out.println(s1 + " and " + s2 + " are not anagram.");
	      }
	}
}

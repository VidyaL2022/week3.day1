package week3.day1;

public class Assignment3FindTypes {

	public static void main(String[] args) {
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Here is what the count you need to find
				@SuppressWarnings("unused")
				int  letter = 0, space = 0, num = 0, specialChar = 0;
				@SuppressWarnings("unused")
				char[] charArray = test.toCharArray();
				
				for(int i = 0;i<test.length();i++) {
					@SuppressWarnings("unused")
					boolean flag = Character.isLetter(test.charAt(i));
					boolean flag1 = Character.isDigit(test.charAt(i));
					boolean flag11 = Character.isSpaceChar(test.charAt(i));
					
					if(flag) {
						System.out.println("'" + test.charAt(i) + "' is a letter");
					}
					if(flag1) {
						System.out.println("'" + test.charAt(i) + "' is a number");
					}
					if(flag11) {
						System.out.println("'" + test.charAt(i) + "' is a space");
				}else {
					System.out.println("'" + test.charAt(i) + "' is a special Character");
	}
				}
}
}
	


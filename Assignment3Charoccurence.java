package week3.day1;

public class Assignment3Charoccurence {

	public static void main(String[] args) {
	
		String str = "welcome to chennai";
		char c ='c';
		System.out.println("Character for the occurance is: "+ c);
		@SuppressWarnings("unused")
		int count = 0;
		@SuppressWarnings("unused")
		char[] charArray = str.toCharArray();
		int size =charArray.length;
		
		for( int i=0;i<size;i++)
		{
			if(str.charAt(i) == c)
				count++;
		}
		System.out.println("c "+ "occurs " + count + "times in" + "'" +str + "'");
	}

}

package org.mvpig.bookJavaFundamentals;

public class StringLength {
	public static void main (String[] args) {
		//Create two String objects
		String str1 = new String();
		String str2 = new  String("Hello");
		
		//Get the length of str1 and str2
		int len1 = str1.length();
		int len2 = str2.length();
		//len 1 is equal to 0
		int len4 = "".length(); 
		//len 2 is equal to 5
		int len2 = "Hello".length()
		
		//Display  the length of str1 and str2
		System.out.println("Length of \"" + str1 + "\" = " +len1);
		System.out.println("Length of \"" + str2 + "\" = " +len2);
		
	}
	//String Objects are immutable
	String str = " ";//Declaro un String
	//String ahora no podemos cambiar, porque ya apunta a un objeto en memoria
	str = new String("Just a string");
	//This is a String object, which is immutable
	str = new String("Another string");
	

}

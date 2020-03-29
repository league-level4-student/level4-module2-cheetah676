package StringMethods;

import java.util.Arrays;
import java.util.Base64;

/*
Visit the JavaDocs for the String class to view everything you can do with a String.  


HINT:  Here are some String methods you might find useful 
contains
replace
trim
length
getBytes
endsWith
split 
indexOf
lastIndexOf
compareTo(IgnoreCase)
substring


Here are some Character methods you might find useful:
Character.toLowerCase(char c);
Character.isLetter(char c);
Character.isDigit(char c);
Character.getNumericValue(char c);
 */

public class StringMethods {

	// Given Strings s1 and s2, return the longer String
	public static String longerString(String s1, String s2) {
		if(s1.length()>s2.length()) {
			return s1;
		}
		else {
		return s2;
		}
	}

	
	// if String s contains the word "underscores", change all of the spaces to underscores
	public static String formatSpaces(String s) {
		if(s.contains("underscores")) {
			String newS=s.replace(' ', '_');
			return newS;
		}
		else {
		return s;
	}
		}

	
	// Return the name of the person whose LAST name would appear first if they were in alphabetical order
	// You cannot assume there are no extra spaces around the name, but you can
	// assume there is only one space between the first and last name
	public static String lineLeader(String s1, String s2, String s3) {
		String tempStrings1="";
		int i=0;
		boolean reachedFirstNameFors1=false;
		boolean reachedSpaceBetweenNamesFors1=false;
		while(reachedFirstNameFors1==false){
		if(s1.charAt(i)!=' ') {
			reachedFirstNameFors1=true;
			tempStrings1+=s1.charAt(i);
		}
		else {
			
		} 
		i++;
		}
		while(reachedSpaceBetweenNamesFors1==false) {
			if(s1.charAt(i)==' ') {
				reachedSpaceBetweenNamesFors1=true;
				tempStrings1+=s1.charAt(i);
			}
			else {
				tempStrings1+=s1.charAt(i);
			}
				i++;
		}
		char s1LastNameChar=s1.charAt(i);
		tempStrings1+=s1.charAt(i);
		String s1LastName=Character.toString(s1LastNameChar);
		
		String tempStrings2="";
		i=0;
		boolean reachedFirstNameFors2=false;
		boolean reachedSpaceBetweenNamesFors2=false;
		while(reachedFirstNameFors2==false){
		if(s2.charAt(i)!=' ') {
			reachedFirstNameFors2=true;
			tempStrings2+=s2.charAt(i);
		}
		else {
			
		} 
		i++;
		}
		while(reachedSpaceBetweenNamesFors2==false) {
			if(s2.charAt(i)==' ') {
				reachedSpaceBetweenNamesFors2=true;
				tempStrings2+=s2.charAt(i);
			}
			else {
				tempStrings2+=s2.charAt(i);
			}
			i++;
		}
		char s2LastNameChar=s2.charAt(i);
		tempStrings2+=s2.charAt(i);
		String s2LastName=Character.toString(s2LastNameChar);
		
		String tempStrings3="";
		i=0;
		boolean reachedFirstNameFors3=false;
		boolean reachedSpaceBetweenNamesFors3=false;
		while(reachedFirstNameFors3==false){
		if(s3.charAt(i)!=' ') {
			reachedFirstNameFors3=true;
			tempStrings3+=s3.charAt(i);
		}
		else {
			
		} 
		i++;
		}
		while(reachedSpaceBetweenNamesFors3==false) {
			if(s3.charAt(i)==' ') {
				reachedSpaceBetweenNamesFors3=true;
				tempStrings3+=s3.charAt(i);
			}
			else {
				tempStrings3+=s3.charAt(i);
			}
				i++;
		}
		char s3LastNameChar=s3.charAt(i);
		tempStrings3+=s3.charAt(i);
		String s3LastName=Character.toString(s3LastNameChar);
		
System.out.println(s1LastName);
System.out.println(s2LastName);
System.out.println(s3LastName);
		if(s1LastName.compareTo(s2LastName)<1 && s1LastName.compareTo(s3LastName)<1) {
			return tempStrings1;
		}
		else if(s2LastName.compareTo(s1LastName)<1 && s2LastName.compareTo(s3LastName)<1) {
			return tempStrings2;
		}
		else if (s3LastName.compareTo(s1LastName)<1 && s3LastName.compareTo(s2LastName)<1) {
			return tempStrings3;
		}
		return null;
	}
	
	
	// Return the sum of all numerical digits in the String
	public static int numeralSum(String s) {
		int sum=0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isLetter(s.charAt(i))==false) {
			sum=sum+Character.getNumericValue(s.charAt(i));
		}
			else {
				
			}
		}
		return sum;
	}
	
	
	// Return the number of times String substring appears in String s
	public static int substringCount(String s, String substring) {
		int charsInSubString=substring.length();
		int goingThroughSubString=0;
		int timesStringHadSubString=0;
		int lettersMatch=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==substring.charAt(goingThroughSubString)) {
				lettersMatch++;
				if(charsInSubString==lettersMatch) {
					timesStringHadSubString++;
					goingThroughSubString=0;
					lettersMatch=0;
					}
				
				else {
					goingThroughSubString++;
				}
				}
			else {
				lettersMatch=0;
				goingThroughSubString=0;
			}
			}
		
		return timesStringHadSubString;
	}

	// Call Utitilities.encrypt to encrypt String s
	public static String encrypt(String s, char key) {
		byte[] plainText=s.getBytes();
		byte keyThing=(byte)key;
		String returner=Utilities.encrypt(plainText, keyThing);
		return returner;
	}

	// Call Utilities.decrypt to decrypt the cyphertext
	public static String decrypt(String s, char key) {
		byte keyThing=(byte)key;
		String returner=Utilities.decrypt(s, keyThing);
		return returner;
	}


	// Return the number of words in String s that end with String substring
	// You can assume there are no punctuation marks between words
	public static int wordsEndsWithSubstring(String s, String substring) {
		substring+=' ';
		int charsInSubString=substring.length();
		int goingThroughSubString=0;
		int timesStringHadSubString=0;
		int lettersMatch=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==substring.charAt(goingThroughSubString)) {
				lettersMatch++;
				if(charsInSubString==lettersMatch) {
					timesStringHadSubString++;
					goingThroughSubString=0;
					lettersMatch=0;
					}
				
				else {
					goingThroughSubString++;
				}
				}
			else {
				lettersMatch=0;
				goingThroughSubString=0;
			}
			}
		
		return timesStringHadSubString;
	}
	
	

	// Given String s, return the number of characters between the first occurrence
	// of String substring and the final occurrence
	// You can assume that substring will appear at least twice
	public static int distance(String s, String substring) {
		return 0;
	}


	// Return true if String s is a palindrome
	// palindromes are words or phrases are read the same forward as backward.
	// HINT: ignore/remove all punctuation and spaces in the String
	public static boolean palindrome(String s) {
		return true;
	}
	
}

class Utilities {
	// This basic encryption scheme is called single-byte xor. It takes a single
	// byte and uses exclusive-or on every character in the String.
	public static String encrypt(byte[] plaintext, byte key) {
		for (int i = 0; i < plaintext.length; i++) {
			plaintext[i] = (byte) (plaintext[i] ^ key);
		}
		return Base64.getEncoder().encodeToString(plaintext);
	}

	public static String decrypt(String cyphertext, byte key) {
		byte[] b = Base64.getDecoder().decode(cyphertext);
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) (b[i] ^ key);
		}
		return new String(b);
	}
}

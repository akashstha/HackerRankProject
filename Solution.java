package aisha;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your word ");
		String akash = scan.next();
		char abc[] = akash.toCharArray();
		System.out.println("Your results : ");
		{
			for (int i = 0; i < abc.length; i++) {
				char c = akash.charAt(i);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					System.out.println(c);
				}

			}
			
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		for(int i=0;i<abc.length;i++) {
			char c=akash.charAt(i);
			if(c!='a'&& c!='e' && c!='i'&& c!='o'&& c!='u') {
				System.out.println(c);
			}
	}
}
}
/*
 * char c=akash.charAt(7); System.out.println(c); }
 */

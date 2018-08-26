package String;

import java.util.Scanner;

public class HackerRank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.next();
		char[] inputStream = word.toCharArray();

		System.out.print("Your even String are : ");

		for (int j = 0; j < inputStream.length; j += 2) {

			System.out.print(inputStream[j]);

		}
		System.out.print(" || ");

		System.out.print("Your odd Sting are : ");
		for (int j = 1; j < inputStream.length; j += 2) {
			System.out.print(inputStream[j]);

		}

	}
}

package arrayReverse;

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the no.");

		int[] result = new int[scan.nextInt()];

		for (int i = 0; i < result.length; i++) {
			System.out.println("Enter your No.:");
			result[i] = scan.nextInt();
		}

		for (int i = result.length - 1; i >= 0; i--) {
			int finalResult = result[i];
			
			System.out.print(finalResult+" ");

		}

	}

}

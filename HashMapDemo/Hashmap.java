package HashMapDemo;

import java.util.HashMap;
import java.util.Scanner;




public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> phoneBook = new HashMap<String,Integer>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the list no.");
		int option=scan.nextInt();
		
		for(int i=0;i<option;i++) {
			System.out.println("Enter the Person name:");
			String name=scan.next();
			System.out.println("Enter the Person phone number:");
			Integer phonenumber=scan.nextInt();
			phoneBook.put(name, phonenumber);
			
		}
		System.out.println("************************************");
		while(true) {
		System.out.println("Enter the person name that you want:");
		String search=scan.next();
		Integer phoneNumber = phoneBook.get(search);
		
		System.out.println(phoneNumber!= null ? search+" "+phoneNumber : "phone Number Not found");
		
		
		}

	}

}

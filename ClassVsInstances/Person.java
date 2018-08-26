package ClassVsInstances;

import java.util.Scanner;

public class Person {

	private static int age;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no.");
		age = scan.nextInt();
		Person person = new Person(age);
		person.Compare();

	}

	public Person(int intialAge) {
		if (intialAge < 0) {
			System.out.println("Setting the age to 0");
			this.age = 0;
		}
	}

	public void Compare() {
		if (age >= 18) {
			System.out.println("your old");
		} else if (age > 13) {
			System.out.println("yout teen");
		} else {
			System.out.println("your very young");
		}

	}

}

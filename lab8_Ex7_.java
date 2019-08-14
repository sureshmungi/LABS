package capgemini_labbook;

import java.util.Scanner;

public class lab8_Ex7_ {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		name = sc.next();
		System.out.println(validate(name));

	}

	private static boolean validate(String name) {
		if (name.length() >= 11) {
			if (name.endsWith("_job")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

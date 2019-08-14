package capgemini_labbook;

import java.util.Scanner;

public class lab1_Ex4_checkNumber {
	private static Scanner sc;

	public static void main(String[] args) {
		// Todo Auto Generated method stub
		long  n;
		sc = new Scanner(System.in);
		n = sc.nextLong();
		boolean b = checkNumber(n);
		if (b)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	private static boolean checkNumber(long n)
	// Todo Auto Generated method stub
	{
		if (n == 0) {
			return false;
		}
		while (n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n /= 2;

		}
		return true;
	}
}

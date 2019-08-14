package capgemini_labbook;

import java.util.Scanner;

public class lab8_Ex5_PositiveString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str,str1;
	System.out.println("Enter your String");
	str1=sc.nextLine();
	str = str1.toLowerCase();
	int n=str.length();
	int flag=1;
	for (int i = 0; i <n-1; i++) {
		if (str.charAt(i)<=str.charAt(i+1)) {
			 flag=1;
		} else {
			 flag=0;
			break;

		}
	}
		if(flag==1)
		{
			System.out.println("Its a positive String...");
		}
		else
		{
			System.out.println("Its not a positive String...");
		}
	}

}
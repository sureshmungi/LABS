package capgemini_labbook;

import java.util.Scanner;
class AgeException extends Exception{
	public AgeException(String str){
		System.out.println(str);
	}
}

public class lab5_Ex5_AgeException {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age->");
	
	int age=sc.nextInt();
	
		
		try {
		
			if(age<=15) 
				throw new Exception("Invalid Age...");
			else
				System.out.println("Valid Age...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
	}
}

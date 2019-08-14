package capgemini_labbook;

import java.util.Scanner;

public class lab5_Ex4_EmpName {
public static void main(String[] args) {
	String firstName,lasNname;
	Scanner sc = new Scanner(System.in);
	firstName= sc.nextLine();
	lasNname= sc.nextLine();
	sc.close();
	try {
		if(firstName.isEmpty()||lasNname.isEmpty()) 
			throw new Exception("invalid");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}
}

package capgemini_labbook;
import com.cg.eis.exception.*;
	
import java.util.Scanner;

class EmployeeException extends Exception{
	public EmployeeException(String str){
		System.out.println(str);
	}
}

public class lab5_Ex6_EmployeeException {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary:");
	
	int Salary=sc.nextInt();
	
		
		try {
		
			if(Salary<=3000) 
				throw new Exception("Invalid ");
			else
				System.out.println("Salary is greater than 3000");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
}

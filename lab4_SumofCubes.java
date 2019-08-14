package capgemini_labbook;

import java.util.Scanner;

public class lab4_SumofCubes {
	//returns the sum of cubes
	public static int sumofcubes(int n){
		int temp;
		int sum=0;
		while(n>0){
			for (int i=0;i <=n; i++) {
				int tem = n%10;
				sum=sum+(tem*tem*tem);
				n=n/10;	
			}
		}
		return sum;
		
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	while(true){
	System.out.println("Enter number");
	int n= sc.nextInt();
	sc.nextLine();
	System.out.println(sumofcubes(n));
	
}
}
}

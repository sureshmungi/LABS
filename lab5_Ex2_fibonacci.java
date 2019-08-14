package capgemini_labbook;
import java.util.Scanner;

public class lab5_Ex2_fibonacci {

		
	 public static int fibb(int n){
		 if(n<=1)
			 return n;
		 else
			 return fibb(n-1)+fibb(n-2);
		 
	 }
	
	 public static void main(String[] args) {
		int a=1,b=1,c=0,i;
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(fibb(n));
		for(i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}
	

}

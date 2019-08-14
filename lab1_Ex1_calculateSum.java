package capgemini_labbook;

import java.util.Scanner;

public class lab1_Ex1_calculateSum
{
	public static int calculateSum(int n)
	{
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			if(i%5==0 ||i%3==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int result=calculateSum(n);
		System.out.println("sum="+result);
	}
}


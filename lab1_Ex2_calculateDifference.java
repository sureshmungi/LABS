package capgemini_labbook;

import java.util.Scanner;

public class lab1_Ex2_calculateDifference
{
	public static int calculateDifference(int n)
	{
		int i,sum1=0,sum2=0,diff;
		for(i=1;i<=n;i++)
		{
			
				sum1=sum1+i;
				sum2=sum2+(i*i);
		}
		int s=sum1*sum1;
		diff=sum2-s;
		return diff;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int result=calculateDifference(n);
		System.out.println("difference="+result);
	}
}

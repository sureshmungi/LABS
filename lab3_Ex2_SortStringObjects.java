package capgemini_labbook;

import java.util.Arrays;
import java.util.Scanner;

public class lab3_Ex2_SortStringObjects {
	public static void SortString(String str[]){
		int j;
		Arrays.sort(str);
		if(str.length%2!=0)
		{
			for(j=0;j<str.length;j++)
			{
				if(j<=(str.length)/2){
					System.out.println(str[j].toUpperCase());
				}else
				{
					System.out.println(str[j].toLowerCase());
				}
			}
		}
		else
		{
			for(j=0;j<str.length;j++)
			{
			if(j<(str.length)/2)
			{
				System.out.println(str[j].toUpperCase());
			}else
				{
				System.out.println(str[j].toLowerCase());
				}
			}
		}
	}



	public static void main(String[] args) {
		int n,i;
		String str[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of string");
		n=sc.nextInt();
		sc.nextLine();
		str=new String[n];
		for(i=0;i<n;i++){
			str[i]=sc.next();
		}
		SortString(str);
		
	}
}



package capgemini_labbook;

import java.util.Arrays;
import java.util.Scanner;

public class lab3_Ex3_getSorted {
public static void main(String[] args) {
	int n,i;
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	int a[]= new int[n];
	for (i = 0; i < n; i++) {
		a[i]= sc.nextInt();
		
		
	}
	int b[]=getSorted(a);
	for(int k:b){
		System.out.println(k);
	}
}
private static int[] getSorted(int a[]){
	int i;
	for(i=0;i<a.length;i++)
	{
		String s;
		StringBuilder str=new StringBuilder("");
		s=str.append(a[i]).reverse().toString();
		a[i]= Integer.parseInt(s);
	}
	Arrays.sort(a);
	return a;
	
}
}

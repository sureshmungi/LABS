package capgemini_labbook;

import java.util.Arrays;
import java.util.Scanner;

public class lab3_Ex1_getSecondSmallest {
	public static int getSecondSmallest(int a[], int n){
		//Arrays.sort(a);
		int temp;
		 for (int i = 0; i < n; i++) {   
           for (int j = i; j < n; j++) {   
               if(a[i] > a[j]) {  
                   temp = a[i];  
                   a[i] = a[j];  
                   a[j] = temp;  
               }  
           }
		 }
              return a[1];
	}
	
public static void main(String[] args) {
	int i,n;
	Scanner sc =new Scanner(System.in);
	System.out.println("mention size of array");
	n=sc.nextInt();
	int a[]=new int[n];
	
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	 System.out.println("second Smallest is:"+getSecondSmallest(a,n));
}
}

package capgemini_labbook;

import java.util.Arrays;
import java.util.Scanner;

public class lab3_Ex4_CountCharacters {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int count[]= new int[52];
		String s= sc.next();
		char a[]= new char[s.length()];
		for ( i = 0; i < s.length(); i++) {
			a[i]= s.charAt(i);
			
		}
		Arrays.sort(a);
		for (i = 0; i < a.length; i++) {
			if(a[i]>='a'&& a[i]<='z')
				count[a[i]-'a']++;
			else
				count[a[i]-'A']++;
				
		}
		StringBuilder b= new StringBuilder();
		for ( i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i+1])
			{
				b.append(a[i]);
			}
	
	}
		b.append(a[a.length-1]);
		b.toString().toLowerCase();
		for ( i = 0; i < b.length(); i++) {
			if(b.charAt(i)>='a'&& b.charAt(i)<='z'||(b.charAt(i)>='a'&& b.charAt(i)<='z'))
				System.out.println(b.charAt(i)+"="+count[b.charAt(i)-'a']);
		}
			
		}

}

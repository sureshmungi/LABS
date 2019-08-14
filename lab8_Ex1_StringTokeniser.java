package capgemini_labbook;

import java.util.Scanner;
import java.util.StringTokenizer;

public class lab8_Ex1_StringTokeniser {
public static void main(String[] args) {
	String str;
	int sum=0;
	String num;
	Scanner sc = new Scanner(System.in);
	str= sc.nextLine();
	StringTokenizer stk= new StringTokenizer(str);
	while(stk.hasMoreTokens()) {
		
		num=stk.nextToken();
		sum+=Integer.parseInt(num);
		System.out.println(num);
		
	}System.out.println(sum);
	

}
}
package capgemini_labbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class countClass {

	public static Map<Character, Integer> charCountMap(char[] arr) {
		
		int count;
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}

			}
			charCountMap.put(arr[i], count);
		}
		System.out.println("size:"+charCountMap.size()+"elements"+charCountMap);
	
		return charCountMap;
	}
}

public class lab9_Ex2_ {
	public static void main(String[] args) {

		countClass obj = new countClass();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		Map<Character, Integer> h = obj.charCountMap(c);
		System.out.println(h);

	}

}

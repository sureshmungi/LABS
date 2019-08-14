package capgemini_labbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class lab8_Ex3 {
	
public static void main(String[] args) {
	 File file = new File("C:\\Capgemini\\dataoutput.txt");
	 try {
		int count=0,count1=0,count2=0;
		FileReader filereader = new FileReader(file);
		count=(int)file.length();
		
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		while ((line = bufferedReader.readLine())!=null) 
		{
			String[]  wordList=line.split(" ");
			count1+=wordList.length;
			count2++;
			
		}
		System.out.println("CharacterCount="+((count)-(count2-1)*2));
		System.out.println("wordCount="+(count1));
		System.out.println("LineCount="+(count2));
		
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
}
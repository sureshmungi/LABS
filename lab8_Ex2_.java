package capgemini_labbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class lab8_Ex2_ {
	public static void main(String[] args)  {
		File file = new File("C:\\Capgemini\\dataout.txt");
		System.out.println(file.exists());
		FileReader fileReader;
		LineNumberReader lineNumberReader;
		try {
			fileReader=new FileReader(file);
			lineNumberReader=new LineNumberReader(fileReader);
			String s=lineNumberReader.readLine();
			while(s!=null)
			{
				System.out.println(lineNumberReader.getLineNumber()+":"+s);
				s=lineNumberReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			}
		}
	



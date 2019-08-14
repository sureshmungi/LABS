package capgemini_labbook;

import java.io.File;
import java.util.Scanner;

public class lab8_Ex4_ {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter file location/path");
	String path=sc.next();
	File file = new File(path);
	
	System.out.println("Existing file?"+file.exists());
	System.out.println("Readable File?"+file.canRead());
	System.out.println("Writeable File?"+file.canWrite());
	System.out.println("File length(characters)"+file.length());
	
	String str= null;
	int index = path.lastIndexOf(".");
	if (index>=0) {
		str= path.substring(index+1);
		
	}
	System.out.println("File Type:"+str);
	System.out.println("File Size"+(file.length()*2));
	
}
}

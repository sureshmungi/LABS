package capgemini_labbook;

import java.io.*;

class ThreadFile implements Runnable {
	public void run() {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;

		String line = "";
		try {
			fr = new FileReader("Read.txt");
			fw = new FileWriter("‪C:\\Capgemini\\Write.txt", true);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			line = br.readLine();

			while (line != null) {
				System.out.println(line);
				bw.write(line.toString());
				bw.flush();
				line = br.readLine();
			}
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

	public class lab10_Ex1 {
		public   static void main (String[] args) {
			ThreadFile obj = new ThreadFile();
			Thread th = new Thread(obj);
			th.start();
		}
	}


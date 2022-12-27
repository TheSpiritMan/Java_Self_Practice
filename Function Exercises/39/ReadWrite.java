import java.io.*;
import java.util.Scanner;
public class ReadWrite{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter source file's path: ");
		String src = input.next();
		File in = new File(src);

		System.out.print("Enter destination file's path: ");
		String dest = input.next();
		File out = new File(dest);

		FileReader fRead = null;
		FileWriter fWrite = null;

		try{
			fRead = new FileReader(in);
			fWrite = new FileWriter(out);

			int ch;
			while((ch = fRead.read()) != -1){
				fWrite.write(ch);
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(-1);
		}finally{
			try{
				fRead.close();
				fWrite.close();
			}catch(IOException e){}
		}
	}
}




//Input
/*
Enter source file's path: src.txt
Enter destination file's path: dest.txt

*/



//Now check your dest.txt file.
package FileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//**************************Read char By char   *******************//
		
		   File file = new File("../Practice/Test.txt");
		   FileReader fr = new   FileReader(file);
		   int a ; 
		 /* while((a=fr.read())!=-1) {
		 * System.out.println((char)a); }
		 */
			
	//********************** Read LIne by line *******************//
		BufferedReader Br = new BufferedReader(fr); /////////////Read line 
		String s;
	while(( s=Br.readLine())!=null)
	{
		
	System.out.println(s);
	}
//	File file  = new File("../Java_Learning/TestWritefile");
	/*FileWriter fw = new FileWriter(file);*//// this is for file write 
	/*FileWriter fw = new FileWriter(file, true); // this is for append code 
	BufferedWriter bw = new BufferedWriter(fw);
	bw.newLine();
	bw.write("My name is himanshu test AAAAAAAAAAAA ");
	bw.newLine();
	bw.write("this is Java code updated AAAAAAAAAAAA");

	bw.close();
	System.out.println("Done");
		*/
		}
			
	}
	


package FileRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read {

	public void Write(String Filepath) throws IOException {
		Scanner s = new Scanner(System.in);
		File f = new File(Filepath);
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		String newWrod;
		System.out.println("Please enter the word you want to write in file");
		newWrod = s.next();
		bw.newLine();
		bw.write(newWrod);
		bw.close();
	}

	public void WriteTill(String FilePath) throws IOException {
		Scanner s = new Scanner(System.in);
		int row, count;
		File f = new File(FilePath);
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Please enter the row number till what you want to add the text");
		row = s.nextInt();
		count = 0;
		while (count < row) {
			count = count + 1;
			String write;
			System.out.print("Please enter the line you want to enter");
			write = s.nextLine();
			bw.write(write);
			bw.newLine();
		}
		bw.close();

	}
	
	public void readWrite(String FilePath) throws IOException
	{
		Scanner s = new Scanner(System.in);
		int iniRow, endRow;
		File f = new File(FilePath);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		String s1;
		String word;
		int count =0;
		System.out.println("Enter the starting line from where you want to start writing");
		iniRow = s.nextInt();
		System.out.println("Enter the end line till where you want to write");
		endRow = s.nextInt();
		while((s1=br.readLine())!=null)
		{
			count++;
			if(count>=iniRow && count<endRow)
			{
				bw.newLine();
				System.out.println("Please enter the String that you want to add ");
				word = s.next();
				bw.write(word);
			}
		}
		bw.close();
	}

	public void fetch(String Filepath) throws IOException {
		File f = new File(Filepath);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int count = 0;
		while ((line = br.readLine()) != null) {
			count++;
			System.out.println("Text on the line: " + count + " is: " + line);
		}
	}

	public void fetchRow(String FilePath) throws IOException {
		File f = new File(FilePath);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		System.out.println("Enter the row number whose text you want to read");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int count = 0;
		while ((s = br.readLine()) != null) {
			count++;
			if (count == a) {
				System.out.println("Line number: " + count + " contains text: " + s);
			}
		}
	}

	public void RangeRead(String FilePath) throws IOException {
		int iniRow, endRow;
		Scanner s = new Scanner(System.in);
		File f = new File(FilePath);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		System.out.println("Please enter the starting point from where you want to start the file reading from");
		iniRow = s.nextInt();
		System.out.println("Please enter the Endpoint of file read");
		endRow = s.nextInt();
		int count = 0;
		String s1;
		while ((s1 = br.readLine()) != null) {
			count = count + 1;
			if (count >= iniRow && count <= endRow) {
				System.out.println("Line number: " + count + " contains text: " + s1);
			}
		}
	}
	
	public void fetchRead(String FilepathRead, String FilepathWrite) throws IOException
	{
		Scanner s = new Scanner(System.in);
		File f = new File(FilepathRead);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		File f1 = new File(FilepathWrite);
		FileWriter fw = new FileWriter(f1,true);
		BufferedWriter bw = new BufferedWriter(fw);
		String reader;
		while((reader=br.readLine())!=null)
		{
			bw.newLine();
			bw.write(reader);
		}
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Read obj = new Read();
		String file = "../Practice/Written.txt";
		String Write = "../Practice/ReadWrite.txt";
//		obj.Write(file);
//		obj.fetch(file);
//		obj.fetchRow(file);
//		obj.RangeRead(file);
//		obj.readWrite(file);
//		obj.WriteTill(file);
		obj.fetchRead(file, Write);
		System.out.println("**********************Reading the written text file******************");
		System.out.println();
		obj.fetch(file);
	}

}

package StringHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataTransverse {
	public static void main(String[] args) throws IOException {
		File f = new File("../Practice/Test.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int count = 0;
		int countWord = 0;
		int countCharac = 0;
		String words[];
		String wordLine[];
		while ((line = br.readLine()) != null) {
			count++;
			System.out.println("Data in the file is: "+line);
			words = line.split("[\n]");
			for (String word : words) {
				wordLine = word.split(" ");
				for(String wordLine1: wordLine)
				{
				countWord++;
				}
				int text = word.length();
				for (int i = 0; i < text; i++) {
					countCharac++;
				}
			}

		}
		System.out.println("\n");
		System.out.println("The count of lines in the file is: "+count);
		System.out.println("The count of words in the file is: "+countWord);
		System.out.println("The count of character in the file is: "+countCharac);
	}
}

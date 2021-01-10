package StringHandling;

public class RevreseWordsOfString {

	public static void main(String[] args) {
		String test = "My Name Is Rishabh";
		String temp[] = test.split(" ");

		int l = temp.length;

		for (int i = 0; i < l; i++) {
			String word = temp[i];
			for (int j = word.length() - 1; j >= 0; j--) {

				System.out.print(word.charAt(j));
			}
			System.out.println("");

		}
	}

}

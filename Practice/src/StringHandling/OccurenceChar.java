package StringHandling;

public class OccurenceChar {

	public static void main(String[] args) {
		String word = "my name  is deepak chanana";
		int l = word.length();
		int count = 0;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {

				if (word.charAt(i) == word.charAt(j) && word.charAt(i) == 'e') {

					count++;
				}
			}
			if (word.charAt(i) == 'e') {
				break;
			}

		}
		System.out.println("Number of times char e is repeated is: " + count);
	}

}

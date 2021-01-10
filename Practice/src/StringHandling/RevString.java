package StringHandling;

public class RevString {
 public static void main(String[] args) {
	String Name;
	Name = "My name is rishabh singh";
	String rev[]=Name.split(" ");
	int l = rev.length;
	
	for(int i =l-1;i>=0;i--)
	{
		String word = rev[i];
		for(int j=word.length()-1;j>=0;j--)
		{
			System.out.print(word.charAt(j));
		}
		System.out.print(" ");
	}
}
}

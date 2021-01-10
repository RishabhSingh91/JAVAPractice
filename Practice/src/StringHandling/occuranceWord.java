package StringHandling;

public class occuranceWord {
	public static void main(String[] args) {
		String word ="my name my is my Rishabh my my name";
		String[]wordCount = word.split(" ");
		int count=0;
		for(int i=0;i<wordCount.length;i++)
		{
			for(int j=i+1;j<wordCount.length;j++)
			{
				if(wordCount[i].equals(wordCount[j])&& wordCount[i].equalsIgnoreCase("my"))
				{
					count++;
				}
				
			}
			break;
		}
		System.out.println("Word my is repeated: "+count+" times");
	}

}

package StringHandling;

public class SortingInteger {
	
	public static void main(String[] args) {
		int arr[] = {1,0,1,0,1,0,1,0,1,0};
		int l = arr.length;
		int temp;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int sorted:arr)
		{
			System.out.print(sorted);
		}
	}

}

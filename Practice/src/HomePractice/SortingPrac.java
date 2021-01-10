package HomePractice;

public class SortingPrac {

	public static void main(String[] args) {

		int[] arr = new int[] { 12, 17, 5, 6, 3, 1, 9, 0 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int k : arr) {
			System.out.println(k);
		}

	}

}

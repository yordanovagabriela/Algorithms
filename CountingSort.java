import java.util.Arrays;

public class CountingSort {

	public static void sort(int[] array) {
		int max = Arrays.stream(array).max().getAsInt();
		int[] newArray = new int[max + 1];
		
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			newArray[current] += 1;
		}
		for (int i = 0; i < newArray.length - 1; i++) {
			newArray[i + 1] += newArray[i];
		}

		int[] finalArray = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			int ind = (--newArray[array[i]]);
			finalArray[ind] = array[i];
		}
		System.arraycopy(finalArray, 0, array, 0, array.length);
	}

	public static void main(String[] args) {
		int[] array = { 2, 27, 22, 8, 28, 1, 30, 8, 29, 28, 15, 16, 25, 28, 23, 16, 24, 23, 17, 11, 4, 2, 2, 22, 23, 8,
				29, 16, 29, 28 };
		sort(array);
		 System.out.println(Arrays.toString(array));
	}

}

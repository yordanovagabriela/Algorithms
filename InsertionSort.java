import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				insert(array, i, i - 1);
			}
		}
	}

	private static void insert(int[] array, int elIndex, int index) {
		while (index >= 0 && array[elIndex] < array[index]) {
			int temp = array[elIndex];
			array[elIndex] = array[index];
			array[index] = temp;
			index--;
			elIndex--;
		}
	}

	public static void main(String[] args) {
		int[] array = { 6, 5, 1, -10, 0, 3, 20, 30, 100, -20000 };
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}
}

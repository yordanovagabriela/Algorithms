import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] array) {
		boolean isSwapped = true;
		while (isSwapped) {
			isSwapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(i, i + 1, array);
					isSwapped = true;
				}
			}
		}
	}

	private static void swap(int index1, int index2, int[] array) {
		int x = array[index1];
		array[index1] = array[index2];
		array[index2] = x;
	}

	public static void main(String[] args) {
		int[] array = { 4, 6, 1, 0, -10, 92 };
		sort(array);
		System.out.println(Arrays.toString(array));
	}
}

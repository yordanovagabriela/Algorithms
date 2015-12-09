import java.util.Arrays;

public class QuickSort {

	private static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int index = partition(array, start, end);
			quickSort(array, start, index - 1);
			quickSort(array, index + 1, end);
		}
	}

	public static void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int wall = start;

		for (int i = start; i < end; i++) {
			if (array[i] < pivot) {
				int temp = array[i];
				array[i] = array[wall];
				array[wall] = temp;
				wall++;
			}

		}
		int temp = array[end];
		array[end] = array[wall];
		array[wall] = temp;

		return wall;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		sort(array);
		System.out.println(Arrays.toString(array));

	}

}

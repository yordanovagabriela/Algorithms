import java.util.Arrays;
public class MergeSort {

	private static void merge(int[] left, int[] right, int[] array) {
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0, j = 0, k = 0;

		while(i < leftSize && j < rightSize) {
			if(left[i] < right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}

		while(i < leftSize) {
			array[k++] = left[i++];
		}

		while(j < rightSize) {
			array[k++] = right[j++];
		}
	}

	public static void mergeSort(int[] array) {
		int size = array.length;
		if(size < 2) {
			return;
		}
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;

		int[] left = new int[leftSize];
		int[] right = new int[rightSize];

		for(int i = 0; i < mid; i++) {
			left[i] = array[i];
		}

		for(int i = mid; i < size; i++) {
			right[i - mid] = array[i];
		}

		mergeSort(left);
		mergeSort(right);
		merge(left, right, array);
	}

	public static void main(String[] args) {
		int[] array = {1, 59, 4, 0, -5, 31};
		mergeSort(array);
		System.out.print(Arrays.toString(array));
	}
}

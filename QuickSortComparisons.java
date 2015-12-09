import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSortComparisons {

	public int comparisons = 0;

	public void quickSort(int[] array, int start, int end) {
		if (start < end) {
			comparisons += (end - start);
			int ind = partition(array, start, end);
			quickSort(array, start, ind - 1);
			quickSort(array, ind + 1, end);
		}
	}

	private int partition(int[] array, int start, int end) {
		int wall = start;
		int pivot = array[start];

		for (int current = start; current <= end; current++) {
			if (array[current] < pivot) {
				swap(array, current, ++wall);
			}
		}

		swap(array, start, wall);

		return wall;
	}


	private void swap(int[] array, int ind_1, int ind_2) {
		int temp = array[ind_1];
		array[ind_1] = array[ind_2];
		array[ind_2] = temp;
	}

	public static int[] getArrayFromFile(File numbers) {
		int[] array = new int[10000];
		Scanner fileReader = null;

		try {
			fileReader = new Scanner(numbers);
			int i = 0;
			while(fileReader.hasNextLine()) {
				array[i] = Integer.parseInt(fileReader.nextLine());
				i++;
			}
		} catch (FileNotFoundException ex) {
			System.out.print("The file was not found");
		} finally {
			if(fileReader != null) {
				fileReader.close();
			}
		}

		return array;
	}

	public static void main(String[] args) {
		QuickSortAlgorithmCoursera q = new QuickSortComparisons();
		int[] array = getArrayFromFile(new File("QuickSortList.txt"));
		q.quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
		System.out.println(q.comparisons);

	}
}

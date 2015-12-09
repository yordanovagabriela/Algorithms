import java.util.Arrays;

public class ShellSort {
	public final static int INTERVAL = 4;
	public static void sort(int[] array) {
		for(int i = 0; i < array.length - INTERVAL;i++) {
			if(array[i] > array[i + INTERVAL]) {
				swap(i,i+INTERVAL,array);
			}
		}
		//after these swaps insertion sort will be faster
		//there will be less cases in which have to perform swapping
	}
	
	private static void swap(int index1, int index2, int[] array) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = {27,50,13,39,57,34,11,22,42,48};
		sort(array);
		System.out.println(Arrays.toString(array));
	}
}

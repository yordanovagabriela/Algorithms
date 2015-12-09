import java.util.Arrays;

public class ShellSort {
	public static void sort(int[] array) {
		int gap = 1;
		while(gap <= array.length/3) {
			gap = gap*3 +1;
		}
		
		for(int i = 0; i < array.length - gap;i++) {
			if(array[i] > array[i + gap]) {
				swap(i,i+gap,array);
			}
		}
		//after these swaps insertion sort will be faster
		//there will be less cases in which you have to perform swapping
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

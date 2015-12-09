import java.util.Arrays;

public class SelectionSort {

	public static void sort(int[] array) {
		
		for(int i = 0;i< array.length;i++) {
			int min = i;
			for(int j = i+1;j< array.length;j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			swap(i,min,array);
		}
	}
	
	public static void swap(int index1, int index2, int[] array) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = {-5,9,0,1,23,-904,35,120,900};
		sort(array);
		System.out.println(Arrays.toString(array));
	}
}

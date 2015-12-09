import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class RadixSort {
	public static void sort(int[] array) {
		int loops = findNumberOfIterations(array);
		ArrayList<LinkedList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr.add(new LinkedList<Integer>());
		}
		int iterator = 0;
		int mod = 10;
		int div = 1;
		while (iterator <= loops) {
			for (int i = 0; i < array.length; i++) {
				int digit = (Math.abs(array[i] % mod)) / div;
				arr.get(digit).add(array[i]);
			}
			int k = 0;
			for (int i = 0; i < arr.size(); i++) {
				while(!arr.get(i).isEmpty()){
					int val = arr.get(i).poll();				
					array[k] = val;
					k++;
				}
			}	
			for (LinkedList<Integer> lst : arr) {
				lst.clear();
			}
			iterator++;
			mod *= 10;
			div *= 10;
		}
	}

	public static void main(String[] args) {
		int[] array = { 9, 179, 139, 38, 10, 5, 36,1000,340,349034 };
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	private static int findNumberOfIterations(int[] array) {
		int max = 1;
		for (int i = 0; i < array.length; i++) {
			int current = (int) (Math.log10(Math.abs(array[i])) + 1);
			if (current > max) {
				max = current;
			}
		}
		return max;
	}
}

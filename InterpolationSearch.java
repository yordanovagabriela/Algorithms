
public class InterpolationSearch {

	public static int search(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		int mid;
		int iterations = 1;
		while (array[low] <= target && array[high] >= target) {
			mid = low + ((target - array[low]) * (high - low)) / (array[high] - array[low]);
			if (array[mid] < target) {
				low = mid + 1;
			} else if (array[mid] > target) {
				high = mid - 1;
			} else {
				return mid;
			}
			iterations++;
		}
		if (array[low] == target) {
			return low;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 12, 34, 56, 59, 60, 75, 99, 102, 135, 220, 401, 609, 2400, 9000, 9999 };
		System.out.println(search(array, 12));
	}
}

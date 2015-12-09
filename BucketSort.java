import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketSort {
	public static final int DEFAULT_BUCKET_SIZE = 5;
	
	public static void sort(int[] array) {
		int max = Arrays.stream(array).max().getAsInt();
		int min = Arrays.stream(array).min().getAsInt();
		
		int bucketsCount = (max - min)/DEFAULT_BUCKET_SIZE +1;
		List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketsCount);
		for(int i = 0;i < bucketsCount;i++) {
			buckets.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < array.length; i++) {
			buckets.get((array[i] - min)/DEFAULT_BUCKET_SIZE).add(array[i]);
		}
		//then insertion sort...
	}
	
	public static void main(String[] args) {
		int[] array = {1,0,40,2,9,18,14,9,0,7,2};
		sort(array);
	}
}

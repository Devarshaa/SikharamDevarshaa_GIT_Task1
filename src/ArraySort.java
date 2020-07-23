import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] nums= {38,57,34,235,8};
		System.out.println("Before Sorting");
		for(int i:nums)
			System.out.println(i);
		Arrays.sort(nums);
		System.out.println("After sorting");
		for(int i:nums)
			System.out.println(i);
		
		

	}

}

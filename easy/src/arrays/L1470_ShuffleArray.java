package arrays;

import java.util.Arrays;

public class L1470_ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 1, 3, 4, 7 };
		// 2,3,5,4,1,7
		shuffle(arr, arr.length / 2);
	}

	public static int[] shuffle(int[] nums, int n) {

		int[] arr = new int[2 * n];
		for (int i = 0,j=0; i < n; ++i) {
			arr[j++] = nums[i];
			arr[j++] = nums[n + i];
		}
		return arr;

//		int tem=0;
//		int[] copyOfRange1 = Arrays.copyOfRange(nums, 0, n);
//		int[] copyOfRange2 = Arrays.copyOfRange(nums, n, nums.length);
//		for(int i=0;i<nums.length;i++) {
//			if (i%2==0)nums[i]=copyOfRange1[i/2];
//			else nums[i]=copyOfRange2[i/2];
//		}
//		return nums;
	}
}

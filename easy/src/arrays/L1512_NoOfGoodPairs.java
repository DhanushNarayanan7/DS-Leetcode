package arrays;

public class L1512_NoOfGoodPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 1, 1, 3 };
		numIdenticalPairs(nums);
	}

	public static int numIdenticalPairs(int[] nums) {
		
		 int ans = 0, cnt[] = new int[101];
	        for (int a:nums){
	            ans+= cnt[a]++;
	            System.out.println(ans);
	        }
	        return ans;
		
//		int counter = 0;
//		int len = nums.length;
//		for (int i = 0, j = 1; j <= len; j++) {
//			if (j == len) {
//				i += 1;
//				j = i + 1;
//			}
//			if (i == len - 1 && j == len)
//				break;
//			if (nums[i] == nums[j]) {
//				counter++;
//			}
//		}
//		return counter;
	}
}

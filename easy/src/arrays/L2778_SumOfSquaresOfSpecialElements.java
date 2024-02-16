package arrays;

public class L2778_SumOfSquaresOfSpecialElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		int[] arr1 = { 2, 7, 1, 19, 18, 3 };
		System.out.println(sumOfSquares(arr1));
	}

	public static int sumOfSquares(int[] nums) {
		int ans = 0;
		for (int i = 1,j=i+1; i <= nums.length; i++) {
            if(nums.length % i == 0 && (i!=nums.length && nums.length%j!=0)){
                ans += nums[i - 1] * nums[i - 1];
                ++i;
                j+=2;
                continue;
            }
			if (nums.length % i == 0 ) ans += nums[i - 1] * nums[i - 1];
			++j;
		}
		return ans;
	}
}

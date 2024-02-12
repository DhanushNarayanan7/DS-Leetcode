package arrays;

public class L1920_BuildArrayFromPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {5,0,1,2,3,4};
		int [] res = new int[nums.length];
		int len = 0;
		while(len!=nums.length) {
			res[len] = nums[nums[len]];
			++len;
		}
		for (int i : res) {
			System.out.println(i);
		}
	}

}

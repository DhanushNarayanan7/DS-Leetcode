package arrays;

public class L1929_ConcatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3};
		int [] res = new int[(nums.length)*2];
		
		for(int i=0;i<nums.length;i++) {
			res[i]=nums[i];
			res[i+nums.length]=nums[i];
		}
		for (int j : res) {
			System.out.println(j);
		}
	}

}

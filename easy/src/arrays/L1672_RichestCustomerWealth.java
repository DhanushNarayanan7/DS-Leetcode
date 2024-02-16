package arrays;

public class L1672_RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		int [][] arr1 = {{1,2,3},{3,2,1}};
		int [][] arr2 = {{2,8,7},{7,1,3},{1,9,5}};
		System.out.println(maximumWealth(arr1));
	}

	public static int maximumWealth(int[][] accounts) {
		int k=0;
		int max=0;
		for (int i=0;i<accounts.length;i++) {
			for(int j=0; j<accounts[i].length;j++) {
				k+=accounts[i][j];
			}
			if(k>max)max=k;
			k=0;
		}
		return max;
	}
}

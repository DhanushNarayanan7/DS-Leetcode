package arrays;

import java.util.Arrays;
import java.util.List;

public class L1431_GreatestNoOfCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 1, 3 };
//		int[] arr = {12,1,12};
		System.out.println(kidsWithCandies(arr,3));
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = candies[0];
		Boolean [] res = new Boolean[candies.length];
		for(int i=1;i<candies.length;i++) {
			if (candies[i]> max) max=candies[i];
		}
		
		for(int j=0;j<candies.length;j++) {
			if (candies[j]+extraCandies>=max) res[j]=true;
			else res[j]=false;
		}
		return Arrays.asList(res);
	}
}

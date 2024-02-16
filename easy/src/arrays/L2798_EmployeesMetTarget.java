package arrays;

import java.util.Arrays;

public class L2798_EmployeesMetTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,1,4,2,2};
		System.out.println(numberOfEmployeesWhoMetTarget(arr,6));
	}

	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		int count=0;
		for(int i=0;i<hours.length;i++) {
			if(hours[i]>=target) count++;
		}
		
		return count;
		// Arrays.sort(hours);
				// for(int i=0;i<hours.length;i++) {
				// 	if(hours[i]>=target) return hours.length-i;
				// }
				// return 0;
	}
}

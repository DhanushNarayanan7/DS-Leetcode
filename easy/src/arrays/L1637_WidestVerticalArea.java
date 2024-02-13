package arrays;

import java.util.Arrays;

public class L1637_WidestVerticalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr ={{8,7},{9,9},{7,4},{9,7}};
		int [][] arr1={{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
		maxWidthOfVerticalArea(arr1);
	}

	public static int maxWidthOfVerticalArea(int[][] points) {

		int res=0, temp=0;
		Arrays.sort(points,(p1,p2)->p1[0]-p2[0]);
		for(int i=0,j=1;j<points.length;i++) {
			temp=points[j][0]-points[i][0];
			if(temp>res) res=temp;
			j++;
		}
		System.out.println(res);
		return 0;
	}
}

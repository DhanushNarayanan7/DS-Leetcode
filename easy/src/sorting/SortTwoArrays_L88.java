package sorting;
import java.util.Arrays;

public class SortTwoArrays_L88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if both arrays are sorted, then this will work.
		int[] arr1 = new int[] { 1, 3, 5, 0, 0, 0 };
		int[] arr2 = { 2, 5, 6 };
		int count =(int) Arrays.stream(arr1).boxed().filter(i->i!=0).count();
		int i = count - 1;//last elemt
		int k = count + arr2.length - 1;
		int j = arr2.length - 1;

		// using three pointer algorithm - inplace
		while (j >= 0) {
			if (i >= 0 && arr2[j] > arr1[i]) {
				arr1[k] = arr2[j];
				--j;
			} else {
				arr1[k] = arr1[i];
				--i;
			}
			--k;
		}

		for (int go : arr1) {
			System.out.println(go);
		}
	}

}
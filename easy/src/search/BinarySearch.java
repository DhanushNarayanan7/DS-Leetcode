package search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3, 4};
		System.out.println(binsearch(arr1, 0, arr1.length, 3));
	}

	private static boolean binsearch(int[] arr1, int i, int j, int target) {
		// TODO Auto-generated method stub
		int mid = (i + j) / 2;
		if (i > j)
			return false;
		if (arr1[mid] == target) {
			return true;
		} else if (target > arr1[mid]) {
			return binsearch(arr1, mid + 1, j, target);
		} else {
			return binsearch(arr1, i, mid - 1, target);
		}
	}

}

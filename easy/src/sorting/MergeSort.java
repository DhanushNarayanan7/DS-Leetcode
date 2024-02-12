package sorting;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 6, 1, 2 };
		System.out.println(Arrays.toString(mergeSort(arr)));
	}

	private static int[] mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		if (arr.length > 1) {
			int mid = (int) arr.length / 2;
//			System.out.println("mid :" + mid);
			int[] left = Arrays.copyOfRange(arr, 0, mid);
//			Arrays.stream(left).forEach(System.out::println);
			int[] right = Arrays.copyOfRange(arr, mid, arr.length);
//			System.out.println("-----");
//			Arrays.stream(right).forEach(System.out::println);
			mergeSort(left);
			mergeSort(right);
			merge(left, right, arr);
		}
		return arr;
	}

	private static void merge(int[] left, int[] right, int[] arr) {
		// TODO Auto-generated method stub
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}

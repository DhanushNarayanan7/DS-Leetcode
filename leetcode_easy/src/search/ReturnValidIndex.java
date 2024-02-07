package search;

public class ReturnValidIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,6,7};
		int target = 4;
		System.out.println(method1(arr, target));
	}

	public static int method1(int[]arr,int target) {
		int start =0;
		int end = arr.length-1;
		if(target>arr[end]) {
			return end+1;
		}
		if(target<arr[start]) {
			return start;
		}
		while(start<=end) {
			int middle = start +((end-start)/2);
			if(target==arr[middle]) {
				System.out.println(middle);
				break;
			}else if(target>arr[middle]) {
				start=middle+1;
			}else {
				end=middle-1;
			}
		}
		return start;
	}
}
package search;

public class SmallestLetterGreaterThanTarget_L744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] arr = {'c','f','j'};
		char target = 'c';
		System.out.println(method1(arr,target));
	}

	private static char method1(char[] arr,char target) {
		// TODO Auto-generated method stub
		int start =0;
		int end = arr.length-1;
		if(target>arr[end]) {
			return arr[start];
		}
		if(target<arr[start]) {
			return arr[start];
		}
		while(start<=end) {
			int middle = start +((end-start)/2);
			if(target==arr[middle]) {
				start=middle+1;
			}else if(target>arr[middle]) {
				start=middle+1;
			}else {
				end=middle-1;
			}
		}
		if (start > arr.length-1) {
			return arr[0];
		}
		return arr[start];
	}

}

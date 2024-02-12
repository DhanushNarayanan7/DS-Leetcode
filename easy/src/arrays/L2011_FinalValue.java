package arrays;

public class L2011_FinalValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s = {"--X","X++","X++"};
		finalValueAfterOperations(s);
	}

	 public static int finalValueAfterOperations(String[] operations) {
	        int res =0;
	        for(String i:operations){
	            if(i.charAt(1)=='-') res--;
	            else ++res;
//	        	res+=i.charAt(1)=='-'? -1:1;
	        }
	        System.out.println(res);
	        return res;
	    }
}

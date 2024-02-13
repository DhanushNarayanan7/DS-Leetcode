package arrays;

import java.util.ArrayList;
import java.util.List;

public class L2942_FindWordsContainingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"abc","bcd","aaaa","cbc"};
		char x = 'a';
		findWordsContaining(arr,x);
	}

	 public static List<Integer> findWordsContaining(String[] words, char x) {
	        List<Integer> list = new ArrayList<>();
	        for (int i = 0; i < words.length; i++) {
				if (words[i].indexOf(x)!=-1)
					list.add(i);
			}
			return list;
			
//			for (int i = 0; i < words.length; i++) {
//				if (words[i].contains(String.valueOf(x)))
//					list.add(i);
//			}
//			return list;
	    }
}

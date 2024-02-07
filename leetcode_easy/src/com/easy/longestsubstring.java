package com.easy;

public class longestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subs2("sabcjpfghimdefgh"));
	}
	
	public static int subs2(String s) {
		int n = s.length();
        int max = 1, len = 1;
        
        for(int i = 1; i < n; i++)
        {
            if(s.charAt(i) - s.charAt(i - 1) == 1)
                len++;
            else
            {
                if(max < len) 
                    max = len;
                
                len = 1;
            }
        }
        if(max < len) 
			max = len;
        
        return max;
	}

	public static int subs(String s) {
		char lastChar = s.charAt(0); //s
        int start = 0;
        int res = 0;
        char [] chars = s.toCharArray();
        
        // loop through each character of the string
        for(int i = 1; i < chars.length; i++){
            // if current character is one more than the previous character in ASCII order
            if(chars[i] == lastChar + 1){
                lastChar = chars[i];
            }
            // otherwise, reset the start index and update the longest length seen so far
            else{
                res = Math.max(res, i - start);
                lastChar = chars[i];
                start = i;
            }
        }
        // handle the case where the longest substring is at the end of the string
        res = Math.max(res, chars.length - start);
        // return the longest length seen
        return res;
	}
}

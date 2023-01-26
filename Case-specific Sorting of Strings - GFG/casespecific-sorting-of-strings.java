//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str){
        // Your code here
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        
        char[] ans = new char[str.length()];
        
        int p =0;
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(Character.isUpperCase(temp)){
                ans[i] = ch[p];
                p++;
            }
        }
        
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(Character.isLowerCase(temp)){
                ans[i] = ch[p];
                p++;
            }
        }
        
        return String.valueOf(ans);
       
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends
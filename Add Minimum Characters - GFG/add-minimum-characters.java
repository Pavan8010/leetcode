//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
	public static int addMinChar(String str){
		//code here
        int cnt = 0;
		int i=0,j=str.length()-1;
		while(i<j){
		    if(str.charAt(i)==str.charAt(j)){
		        i++;
		        j--;
		    }
		    else{
		        cnt++;
		        i = 0;
		        j = str.length()-1 - cnt;
		    }
		}
        return cnt;
        // return -1;
	}
	static boolean ispalindrome(String str){
	    String temp = "";
	    for(int i=str.length()-1;i>=0;i--){
	        temp += str.charAt(i);
	    }
	    return (str.equals(temp));
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String str = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.addMinChar(str));
        }
        
    }
}

// } Driver Code Ends
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] A = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			System.out.println(ob.equalSum(A, N));
		}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int equalSum(int [] a, int n) {
		//Write your code here
		if(n==1){
		    return 1;
		}
		long sum = 0;
		for(int i:a){
		    sum += i;
		}
// 		int cnt = 0;
		long temp = a[0];
		sum -= temp;
		for(int i =1;i<n;i++){
		    sum -= a[i];
		    if(temp == sum){
		        return i+1;
		    }
		    temp += a[i];
		  //  System.out.println(temp + " " + sum);
		}
		return -1;
	}
}
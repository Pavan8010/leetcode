//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int matrixMultiplication(int n, int arr[]){
        int[][] dp = new int[n][n]; 
        // code here
        for(int i=0;i<n-1;i++){
            dp[i][i+1] = 0;
        }
        for(int l=2;l<n;l++){
            for(int i=0;i+l<n;i++){
                int j = i+l;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    
                    int mult = dp[i][k] + dp[k][j] + arr[i]*arr[k]*arr[j];
                
                    if(mult < dp[i][j]){
                        dp[i][j] = mult;
                    }
                }
            }
        }
        return dp[0][n-1];
    }
}
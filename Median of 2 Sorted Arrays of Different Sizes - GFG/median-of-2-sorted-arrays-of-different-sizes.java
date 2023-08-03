//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG { 
    static double medianOfArrays(int n, int m, int a[], int b[]){
        // Your Code Here
        int i=0,j=0,k=0;
        int[] nums = new int[m+n];
        while(i<n && j<m){
            if(a[i]<b[j]){
                nums[k] = a[i];
                i++;
            }else{
                nums[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<n){
            nums[k] = a[i];
            i++;
            k++;
        }
        while(j<m){
            nums[k] = b[j];
            j++;
            k++;
        }
        if((m+n)%2==1){
            return nums[(m+n)/2];
        }
        double n1 = nums[(m+n)/2];
        double n2 = nums[(m+n-1)/2];
        return (n1+n2)/2;
    }
}
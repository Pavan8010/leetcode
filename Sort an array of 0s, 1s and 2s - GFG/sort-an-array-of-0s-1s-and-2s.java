//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

class Solution
{
    public static void sort012(int arr[], int n){
        // code here 
        int a=0,b=0,c=0;
        for(int i:arr){
            if(i == 0){
                a++;
            }else if(i == 1){
                b++;
            }else{
                c++;
            }
        }
        int p =0;
        for(int i=0;i<a;i++){
            arr[p] = 0;
            p++;
        }
        for(int i=0;i<b;i++){
            arr[p] = 1;
            p++;
        }
        for(int i=0;i<c;i++){
            arr[p] = 2;
            p++;
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends
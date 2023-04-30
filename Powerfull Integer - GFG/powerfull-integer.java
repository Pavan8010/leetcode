//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine().trim());
            int a[][]=new int[n][2];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                a[i][0]=Integer.parseInt(s[0]);
                a[i][1]=Integer.parseInt(s[1]);
            }
            int k=Integer.parseInt(in.readLine().trim());
            Solution ob=new Solution();
            out.println(ob.powerfullInteger(n,a,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    public static int powerfullInteger(int n,int interval[][],int k){
        int max=0;
        for(int i=0;i<interval.length;i++){
            if(interval[i][1]>max) max=interval[i][1];
        }
        int[] arr= new int[max+2];
        for(int i=0;i<interval.length;i++){
            arr[interval[i][0]] +=1;
            arr[interval[i][1]+1] -=1;
        }
        for(int i=1;i<max+2;i++){
            arr[i]= arr[i-1]+arr[i];
        }
        
        for(int i=max+1;i>=0;i--){
            if(arr[i]>=k) return i;
        }
        return -1;
    }
}
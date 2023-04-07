//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int space = (n-1)*4;// 1 +4*4 = 17
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+ " ");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+1+ " ");
            }
            space -=4;
            System.out.println("");
        }
    }
}
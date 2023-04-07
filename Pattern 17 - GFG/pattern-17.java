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
        // int star = 1;
        char ch = 'A';
        int space = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch--;
            for(int j=0;j<i;j++){
                ch--;
                System.out.print(ch);
            }
            // star += 2;
            space--;
            System.out.println("");
        }
    }
}
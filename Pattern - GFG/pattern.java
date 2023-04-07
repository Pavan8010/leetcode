//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
        // Your code here
        int space = n-1;
        int star = 1;
        for(int i=0;i<n*2;i++){
            if(i<n){
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<star;j++){
                    System.out.print("* ");
                }
                System.out.println("");
                space -= 1;
                star += 1;
                
            }
            else{
                if(i==n){
                    space = 0;
                    star = n;
                }
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<star;j++){
                    System.out.print("* ");
                }
                System.out.println("");
                space += 1;
                star -= 1;
            }   
        }
    }
}

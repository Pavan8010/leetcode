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
        int space = 0;
        int star = n;
        for(int i=0;i<n*2;i++){
            if(i<n){
                for(int j=0;j<star;j++){
                    System.out.print("*");
                }
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<star;j++){
                    System.out.print("*");
                }
                space +=2;
                star--;
                System.out.println("");
            }else{
                if(i==n){
                    space -=2;
                    star++;
                }
                for(int j=0;j<i-n+1;j++){
                   System.out.print("*");
                }
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<i-n+1;j++){
                    System.out.print("*");
                }
                space -=2;
                star++;
                System.out.println("");
            }
        }
    }
}
//  5
// 5 1
// 6 2
// 7 3
// 8 4
// 9 5
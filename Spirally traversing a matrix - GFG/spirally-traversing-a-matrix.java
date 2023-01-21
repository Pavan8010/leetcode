//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int left=0;
        int top=0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        ArrayList<Integer> list = new  ArrayList<Integer>();
        while(left<=right && top<=bottom){
            for(int i=left;i<=right && top<=bottom;i++){
                int temp = matrix[top][i];
                list.add(temp);
            }
            top++;
            for(int i=top;i<=bottom && left<=right;i++){
                int temp = matrix[i][right];
                list.add(temp);
            }
            right--;
            for(int i=right;i>=left && top<=bottom;i--){
                int temp = matrix[bottom][i];
                list.add(temp);
            }
            bottom--;
            for(int i=bottom;i>=top && left<=right;i--){
                int temp = matrix[i][left];
                list.add(temp);
            }
            left++;
        }
        return list;
    }
}

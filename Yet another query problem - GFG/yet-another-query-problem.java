//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];

        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int num;
            num = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int[][] Q = IntMatrix.input(br, num, 3);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.solveQueries(N, num, A, Q);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> solveQueries(int n, int num, int[] arr, int[][] Q) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int[] q : Q){
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int count = 0;
            int cnt = 0;
            for(int i=l;i<=r;i++){
                // System.out.print("to find " + arr[i] + " ");
                for(int j=i;j<n;j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                    // System.out.print(arr[i] + " " + arr[j] + " " + count+ " ");
                    // System.out.print(count);
                }
                // System.out.println();
                if(count == k){
                    cnt++;
                }
                count=0;
                // System.out.print("fianl cnt : " + cnt);
                // System.out.println();
            }
            ans.add(cnt);
        }
        return ans;
    }
}
        

        // Map<Integer,Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++){
        //     if (map.containsKey(arr[i])){
        //         map.put(arr[i], map.get(arr[i]) + 1);
        //     }
        //     else{
        //         map.put(arr[i], 1);
        //     }
        // }
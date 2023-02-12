//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t;
        t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n;
            n=Integer.parseInt(in.readLine());
            Node head,tail;
            String s[]=in.readLine().trim().split(" ");
            int num=Integer.parseInt(s[0]);
            head=new Node(num);
            tail=head;
            for(int i=1;i<n;i++){
                num=Integer.parseInt(s[i]);
                tail.next=new Node(num);
                tail=tail.next;
            }
            Solution ob=new Solution();
            Node temp=ob.primeList(head);
            while(temp!=null){
                out.print(temp.val+" ");
                temp=temp.next;
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution
{
    Node primeList(Node head){

        //code here
        Node list = head;
        do{
            int N = list.val;
            if(isPrime(N)){
                list.val = N;
            }
            else{
                int num1 = N-1;
                int num2 = N+1;
                while(num1>=0){
                    if(isPrime(num1)){
                        list.val = num1;
                        break;
                    }
                    else if(isPrime(num2)){
                        list.val = num2;
                        break;
                    }
                    num1--;
                    num2++;
                }
            }
            list = list.next;
        } while(list!=null);
        
        return head;
    }
    static boolean isPrime(int N){
        if(N<=1)
            return false;
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}
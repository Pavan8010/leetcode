//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
    int goodSubsets(vector<int> &arr, int n){
        // Code here
        int mm[31]={0};
        mm[2] = 1;
        mm[3] = 2;
        mm[5] = 4;
        mm[6] = 3;
        mm[7] = 8;
        mm[10] = 5;
        mm[11] = 16;
        mm[13] = 32;
        mm[14] = 9;
        mm[15] = 6;
        mm[17] = 64;
        mm[19] = 128;
        mm[21] = 10;
        mm[22] = 17;
        mm[23] = 256;
        mm[26] = 33;
        mm[29] = 512;
        mm[30] = 7;
        unordered_map<int,int> f;
        int c=0;
        for(auto x:arr){
            if(x==1)c++;
            else f[x]++;
        }
        long long int dp[1024]={0};
        int mod = 1e9+7;
        dp[0]=1;
        for(auto x:f){
            if(mm[x.first]!=0){
                for(int i=0;i<1024;i++){
                    if((mm[x.first]&i)==0){
                        dp[(mm[x.first]|i)]+=(x.second*dp[i]);
                        dp[(mm[x.first]|i)]%=mod;
                    }
                }
            }
        }
        long long int ans=0;
        for(int i=1;i<1024;i++){
            ans+=dp[i];
            ans%=mod;
        }
        while(c--){
            ans*=2;
            ans%=mod;
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main(){
    
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> a(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        Solution ob;
        cout<<ob.goodSubsets(a, n)<<endl;
    }
    return 0;
}
// } Driver Code Ends
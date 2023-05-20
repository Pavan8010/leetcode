//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    bool isStraightHand(int n, int gs, vector<int> &arr) {
        if(n % gs) return false;
        
        map<int,int> mp;
        for(auto i: arr) mp[i]++;
        
        map<int,int> fill;
        sort(arr.begin(), arr.end());
    
        for(int i=0;i<n-(gs-1);i++){
            int ele = arr[i];
            if(fill[ele]) {
                fill[ele]--;
                continue;
            }
            for(int j=1;j<gs;j++){
                if(mp[ele+j] == 0) return false;
                fill[ele+j]++;
            }
        }
        return true;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, groupSize;
        cin >> N >> groupSize;

        vector<int> hand(N);
        for (int i = 0; i < N; i++) cin >> hand[i];

        Solution obj;
        int ans = obj.isStraightHand(N, groupSize, hand);
        if (ans)
            cout << "True" << endl;
        else
            cout << "False" << endl;
    }
    return 0;
}
// } Driver Code Ends
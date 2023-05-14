class Solution {
public:
    bool doesValidArrayExist(vector<int>& derived) {
        int n = derived.size();
        // if(n==1 && derived[0] == 0) return false;
        int bit = 1;
        for(int i = 0; i < n; i++) {
            if(derived[i]==1) bit = abs(bit - 1);
        }
        if(bit==1 && (derived[0]==1)) return true;
        if(bit==1 && (derived[0]==0)) return true;
        return false;
    }
};
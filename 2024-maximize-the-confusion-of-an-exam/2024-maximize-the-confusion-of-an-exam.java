class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char [] arr = answerKey.toCharArray();
        int start=0,ans=0;
        int noF=0,noT=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='F')noF++;
            else noT++;

            while(Math.min(noF,noT)>k){
                if(arr[start]=='F')noF--;
                else noT--;
                start++;
            }
            ans = Math.max(ans,noF+noT);
        }
        return ans;
    }
}
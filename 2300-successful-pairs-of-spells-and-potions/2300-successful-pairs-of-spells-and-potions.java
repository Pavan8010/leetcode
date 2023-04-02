class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int cnt = binarySerach(spells[i],potions,success);
            spells[i] = cnt;
        }
        return spells;
    }
    int binarySerach(int target , int[] potions, long success){
        int start =0;
        int end = potions.length-1;
        int n = end;
        while(start<=end){
            int mid = start + (end-start)/2;
            long temp = (long)target*potions[mid];
            if(temp>=success){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return n-end;
    }
}
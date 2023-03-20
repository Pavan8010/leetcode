class Solution {
    public boolean canPlaceFlowers(int[] flower, int n) {
        
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i:flower) list.add(i);
        list.add(0);

        for(int i=1;i<list.size()-1;i++){
            if(list.get(i)== 0 && list.get(i-1)==0 && list.get(i+1)==0){
                n--;
                i++;
            }
            // if(n==0)return true;
        }
        return n<=0;
    }
}
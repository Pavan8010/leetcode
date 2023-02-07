class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int start=0,count=0,maxi=0;
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            count++;
            int sz = mp.size();
            while(sz==3){
                int rep = mp.get(arr[start]);
                if(rep == 1){
                    mp.remove(arr[start]);
                }else{
                    mp.put(arr[start],mp.get(arr[start])-1);
                    // map.replace(key, map.get(key) - 1);
                }
                count--;
                start++;
                sz = mp.size();  
            }
            maxi = Math.max(count,maxi);
        }
        return maxi;
    }
}
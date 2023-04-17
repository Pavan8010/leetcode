class Solution {
    static int largest(int[] arr)
    {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
         
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int high = largest(candies);
        int temp = high - extraCandies;
        for(int i=0;i<candies.length;i++){
            if(candies[i] < temp){
                list.add(false);
            }else{
                list.add(true);
            }
        }
        return list;
    }
}
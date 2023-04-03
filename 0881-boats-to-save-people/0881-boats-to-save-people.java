class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length-1;
        int cnt=0;
        while(start<=end){
            cnt++;
            int sum = people[start] + people[end];
            if(sum<=limit){
                start++;
            }
            end--;
        }
        return cnt;
    }
}
        // int rem = limit,n=people.length;
        // int cnt=1;
        // for(int i=0;i<n;i++){
        //     // cnt++;
        //     rem -= people[i];
        //     System.out.println(rem + " " + cnt);
        //     if(rem>=0 && i == n-1){
        //         return cnt;
        //     }
        //     if(rem<=0 && i == n-1){
        //         cnt++;
        //         return cnt;
        //     }
        //     if(rem<0){
        //         rem = -rem;
        //         rem = limit-rem;
        //         cnt++;
        //     }else if(rem == 0){
        //         rem = limit;
        //         cnt++;
        //     }
        // }
        // return cnt;
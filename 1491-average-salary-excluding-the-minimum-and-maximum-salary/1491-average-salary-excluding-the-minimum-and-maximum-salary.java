class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double total =  0;
        for(int i=1;i<salary.length-1;i++){
            total += (double)salary[i];
        }
        double ans = total/(salary.length-2);
        return ans;
    }
}
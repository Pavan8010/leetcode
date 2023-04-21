class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long sum = mass;
        Arrays.sort(asteroids);
        for(int i :asteroids){
            if(i>sum){
                return false;
            }
            sum += i;
        }
        return true;
    }
}
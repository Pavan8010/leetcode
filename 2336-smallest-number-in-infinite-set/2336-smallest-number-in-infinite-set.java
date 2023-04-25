class SmallestInfiniteSet {
    // Set<Integer> set = new HashSet<>();
    boolean[] arr = new boolean[1001];
    int low =1;
    public SmallestInfiniteSet() {
        int i=0;
        while(i<1001){
            arr[i] = true;
            i++;
        }
    }
    
    public int popSmallest() {
        arr[low] = false;
        int temp = low;
        while(low<arr.length && !arr[low]){
            low++;
        }
        return temp;
    }
    
    public void addBack(int num) {
        if(num<low){
            low = num;
        }
        arr[num] = true;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
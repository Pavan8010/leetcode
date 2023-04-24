class Solution {
    public int lastStoneWeight(int[] stones) {
    List<Integer> list=new ArrayList<>();
    for(int i:stones){
        list.add(i);
    }
    while(list.size()>1){
       Collections.sort(list);
       int y = list.get(list.size()-1);
       list.remove(new Integer(y));
       int x = list.get(list.size()-1);
       list.remove(new Integer(x));
       if(x!=y){
           list.add(y-x);
       }
    }
    if(list.isEmpty()) return 0;
    else return list.get(0);
    }
}
// class Solution {
//     public int lastStoneWeight(int[] stones) {
//         List<Integer> list = new listayList<>();
//         for(int i:stones){
//             list.add(i);
//         }
//         Collections.sort(list);
//         int size = list.size();
//         while(size>1){
//             int f = list.get(list.size()-1);
//             int s = list.get(list.size()-2);
//             if(f==s){
//                 list.remove(f);
//                 list.remove(s);
//             }
//             else if(f!=s){
//                 list.remove(list.get(f));
//                 list.remove(s);
//                 list.add(Math.abs(f-s));
//                 Collections.sort(list);
//             }
//             if(list.size()==1){
//                 return list.get(0);
//             }
//         }
//         return list.get(0);
//     }
// }
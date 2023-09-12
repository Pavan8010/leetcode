//optimized
class Solution {
     public int minDeletions(String s) {
        int[] arr = new int[26];
        int res = 0;
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            int freq = arr[i];
            while (freq > 0) {
                if (!used.contains(freq)) {
                    used.add(freq);
                    break;
                } 
                freq--;
                res++;
            }
        }
        return res; 
    }
}

//my code
// class Solution {
//     public int minDeletions(String s) {
//         Map<Character,Integer> map = new HashMap<>();
//         for(char ch:s.toCharArray()){
//             map.put(ch,map.getOrDefault(ch,0)+1);
//         }
//         List<Integer> list = new ArrayList();
//         int cnt=0;
//         for(char ch:map.keySet()){
//             int freq = map.get(ch);
//             if(list.contains(freq)){
//                 cnt++;
//                 // int i = freq-1;
//                 freq--;
//                 while(freq!=0){
//                     if(list.contains(freq))cnt++;
//                     else {
//                         list.add(freq);
//                         break;
//                     }
//                     freq--;
//                 }
//             }else{
//                 list.add(freq);
//             }
//             // list.add(map.get(ch));
//         }
//         return cnt;
//     }
// }
// 2 3 3 
// 1 2 3

// 1 2 2 3

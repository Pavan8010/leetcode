class Solution {
    public String reverseVowels(String s) {
        List<Character> vowel = new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        char[] ch = s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j && i<ch.length && j>=0){

            if(vowel.contains(ch[i]) && vowel.contains(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            else if(vowel.contains(ch[j]))i++;
            else if(vowel.contains(ch[i]))j--;
            else{
                i++;
                j--;
            } 
        }
        return String.valueOf(ch);
    }
}
// h e l l o
// l e e t c o d e
//   e e o e -> e o e e 
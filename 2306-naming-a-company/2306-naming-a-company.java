class Solution {
    public long distinctNames(String[] ideas) {
        long count=0;
        HashSet<String> set=new HashSet<>();
        int arr[][]=new int[26][26];
        int n=ideas.length;
        for(String s:ideas){
            set.add(s);
        }
        for(String s:ideas){
            for(int j=0;j<26;j++){
                	String str=(char)(j+'a')+s.substring(1);
                    if(!set.contains(str))
					arr[s.charAt(0)-'a'][j]++;
            }
        }
        for(int i=0;i<26;i++)
			for(int j=0;j<26;j++)
				count+=arr[i][j]*arr[j][i];

		return count;
    }
}
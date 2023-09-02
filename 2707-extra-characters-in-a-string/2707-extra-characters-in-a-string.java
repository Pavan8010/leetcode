public class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Map<Integer, Integer> cache = new HashMap<>();
        int result = dfs(s, dictionary, cache);
        return result;
    }

    int dfs(String text, String[] dictionary, Map<Integer, Integer> cache) {
        if (text.isEmpty()) return 0;
        if (cache.containsKey(text.length())) {
            return cache.get(text.length());
        }
        int minimum = text.length();
        for (String word : dictionary) {
            if (text.equals(word)) {
                minimum = 0;
                cache.put(text.length(), minimum);
                return minimum;
            } else if (text.startsWith(word)) {
                int result = dfs(text.substring(word.length()), dictionary, cache);
                minimum = Math.min(minimum, result);
            }
        }
        int result = 1 + dfs(text.substring(1), dictionary, cache);
        minimum = Math.min(minimum, result);
        cache.put(text.length(), minimum);
        return minimum;
    }
}
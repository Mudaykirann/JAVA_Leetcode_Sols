class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // Create a map to store the order of each character
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }
        
        // Compare each adjacent word pair
        for (int i = 0; i < words.length - 1; i++) {
            if (!isInAlienOrder(words[i], words[i + 1], orderMap)) {
                return false;
            }
        }
        
        return true;
    }

    private boolean isInAlienOrder(String word1, String word2, int[] orderMap) {
        int minLength = Math.min(word1.length(), word2.length());
        
        for (int i = 0; i < minLength; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            
            if (c1 != c2) {
                return orderMap[c1 - 'a'] < orderMap[c2 - 'a'];
            }
        }
        
        return word1.length() <= word2.length();
    }
}

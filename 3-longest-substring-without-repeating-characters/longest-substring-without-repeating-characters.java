class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, maxLen = 0;
        int[] hash = new int[256];
        Arrays.fill(hash, -1); 
        
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (hash[c] >= l) {
                l = hash[c] + 1;
            }
            hash[c] = r; 
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int t = 0, targetLen = str2.length();
        
        for (char currChar : str1.toCharArray()) {
            if (t < targetLen && (str2.charAt(t) - currChar + 26) % 26 <= 1) {
                t++;
            }
        }
        return t == targetLen;
    }
}
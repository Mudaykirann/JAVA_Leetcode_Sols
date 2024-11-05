class Solution {
    public boolean isSubsequence(String s, String t) {
         int start=0;
        for (char ch : s.toCharArray()) {
            int index = t.indexOf(ch, start);
            if (index == -1) {
                return false;
            } else {
                start = index + 1;
            }
        }
        return true;
    }
}
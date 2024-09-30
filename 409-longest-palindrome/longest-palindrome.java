
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> h = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            h.put(ch, h.getOrDefault(ch, 0) + 1);
        }

        int length = 0;
        boolean oddFound = false;

        for (int count : h.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1; 
                oddFound = true;     
            }
        }
        if (oddFound) {
            length += 1;
        }

        return length;
    }
}

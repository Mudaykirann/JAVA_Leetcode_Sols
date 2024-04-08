class Solution {
    public int lengthOfLastWord(String s) {
        String[] Str = s.split(" ");
        return Str[Str.length-1].length();
    }
}
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<s.length();i++){
            h.add(s.charAt(i));
        }
        return h.size();
    }
}
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;

        HashSet<Character> h = new HashSet<>();
        for(char c : sentence.toCharArray()){
            h.add(c);
        }
        if(h.size()==26) return true;
        return false;
    }
}
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> newarr = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean found = false;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == x) {
                    newarr.add(i);
                    found = true;
                    break;
                }
            }
        }
        return newarr;
    }
}
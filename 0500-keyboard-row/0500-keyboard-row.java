class Solution {
    public String[] findWords(String[] words) {
        int[] rowMap = new int[128];
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                rowMap[c] = i + 1; 
                rowMap[Character.toUpperCase(c)] = i + 1;
            }
        }
        
        List<String> validWords = new ArrayList<>();
        
        for (String word : words) {
            if (word.isEmpty()) continue;
            
            int firstCharRow = rowMap[word.charAt(0)];
            boolean isSameRow = true;
            
            for (int i = 1; i < word.length(); i++) {
                if (rowMap[word.charAt(i)] != firstCharRow) {
                    isSameRow = false;
                    break;
                }
            }
            
            if (isSameRow) {
                validWords.add(word);
            }
        }
        
        return validWords.toArray(new String[0]);
    }
}
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" "); 
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.append(reverse(word)).append(" ");  
        }
        
        return result.toString().trim(); 
    }

    public String reverse(String word) {
        char[] chars = word.toCharArray(); 
        int i = 0;
        int j = chars.length-1;
        
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        
        return new String(chars);  
    }
}

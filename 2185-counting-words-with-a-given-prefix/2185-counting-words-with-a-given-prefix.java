class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        int n=words.length;
        for(int i=0;i<n;i++){
            if(words[i].startsWith(pref)) c++;
        }   

        return c;
    }
}
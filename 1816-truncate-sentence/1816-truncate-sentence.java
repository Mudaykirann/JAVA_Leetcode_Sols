class Solution {
    public String truncateSentence(String s, int k) {
        String[] wordArray = s.split(" ");
        StringBuilder b = new StringBuilder();
        for(int i=0;i<k;i++){
            b.append(wordArray[i]);
            if(i!=k-1) b.append(" ");
        }
        return b.toString();
    }
}
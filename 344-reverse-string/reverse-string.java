class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<=end){
            swap(s,start,end);
            start++;
            end--;
        }
    }
    void swap(char [] s,int i,int j){
        char c = s[i];
        s[i] = s[j];
        s[j] = c;
    }
}
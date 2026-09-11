class Solution {
    public int scoreOfString(String s) {
        int n = s.length()-1;
        int sum=0;
        int i=0;
        while(i<n){
            sum += Math.abs((int)s.charAt(i+1)- (int)s.charAt(i));
            i++;
        }
        return sum;
    }
}
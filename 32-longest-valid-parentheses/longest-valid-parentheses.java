class Solution {
    public int longestValidParentheses(String s) {
           int l=0,r=0,maxi=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') l++;
            if(s.charAt(i)==')') r++;
            if(l==r){
                maxi = Math.max(maxi,2*l);
            }
            else if(l<r){
                l=0;
                r=0;
            }
        }
        
        l=0;
        r=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='(') l++;
            if(s.charAt(i)==')') r++;
            if(l==r){
                maxi = Math.max(maxi,2*l);
            }
            else if(l>r){
                l=0;
                r=0;
            }
        }
        
        
        return maxi;
    }
}
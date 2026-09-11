class Solution {
    public int maxDistinct(String s) {
        int[] temp = new int[26];
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            int ind = s.charAt(i)-'a';
            if(temp[ind]==0){
                temp[ind]=1;
                c++;
            }
        }
        return c;
    }
}
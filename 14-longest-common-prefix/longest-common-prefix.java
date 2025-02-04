class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        StringBuilder str = new StringBuilder();

        char [] f = strs[0].toCharArray();
        char [] s = strs[strs.length-1].toCharArray();

        for(int i=0;i<f.length;i++){
            if(f[i]!=s[i]) break;
            str.append(f[i]);
        }
        return str.toString();
    }
}
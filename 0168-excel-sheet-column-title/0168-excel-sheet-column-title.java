class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder b = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber%26;
            b.append((char)('A'+rem));
            columnNumber/=26;
        }
        return b.reverse().toString();
    }
}
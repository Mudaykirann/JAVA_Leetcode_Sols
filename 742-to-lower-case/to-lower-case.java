class Solution {
    public String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}
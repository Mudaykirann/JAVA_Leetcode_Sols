class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(!st.isEmpty()){
                if(st.peek() == c){
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }
        return str.reverse().toString();
    }
}
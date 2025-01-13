class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> ch = new HashMap<>();
        for(char c : s.toCharArray()){
            ch.put(
                c,ch.getOrDefault(c,0) + 1
            );
        }

        int delcount = 0;
        for(int f:ch.values()){
            if(f%2==1){
                delcount += f-1;
            }
            else{
                delcount += f-2;
            }
        }
        return s.length() - delcount;
    }
}
class Solution {
    public int countDigits(int num) {
        int temp = num;
        int c=0;
        while(temp>0){
            int d = temp%10;
            if(d>0 && num%d==0){
                c++;
            }
            temp=temp/10;
        }
        return c;
    }
}
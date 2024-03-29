class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n:nums){
            if(even(n)){
                count++; 
            }
        }
        return count;
    }
    boolean even(int num){
        return digit(num) % 2 == 0;
    }
    int digit(int num){
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)+1);
    }
}
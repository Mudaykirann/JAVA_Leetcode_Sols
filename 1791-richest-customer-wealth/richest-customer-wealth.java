class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans =0;
        for(int [] a : accounts){
            int sum=0;
            for(int n : a){
                sum += n;
            }

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
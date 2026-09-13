class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int c1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) c++;
            else c=0;
            c1 = Math.max(c1,c);
        }
        return c1;
    }
}
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
       for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            while(j<nums.length){
                if(nums[i]==nums[j]){
                    c++;
                }
                j++;
            }
       }
        return c;
    }
}
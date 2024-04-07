class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]!=0){
                swap(nums,l,r);
                l++;
            }
            r++;
        }
    }
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
}
}
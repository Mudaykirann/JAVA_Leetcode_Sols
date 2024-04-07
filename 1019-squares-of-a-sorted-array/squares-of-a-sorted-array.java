class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int l=0;
        int r=nums.length-1;
        int currentIndex = nums.length-1;
        while(l<=r){
            int l_num = Math.abs(nums[l]);
            int r_num = Math.abs(nums[r]);
            if(l_num >= r_num){
                arr[currentIndex] = (l_num*l_num);
                l++;
            }
            else{
                arr[currentIndex] = (r_num*r_num);
                r--;
            }
            currentIndex--;
        }
        return arr;
    }
}
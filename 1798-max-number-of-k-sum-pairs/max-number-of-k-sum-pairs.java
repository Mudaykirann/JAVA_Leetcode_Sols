class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int zerosCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k) {
                nums[i] = 0;
            }
        } 
        Arrays.sort(nums);
        int left = zerosCount;
        int right = nums.length - 1;
        while(left < right) {
            if (nums[left] + nums[right] == k) {
                count++;
                left++;
                right--;
            } else if (nums[left] + nums[right] > k) {
                right--;
            } else if (nums[left] + nums[right] < k) {
                left++;
            }
        }

        return count;
    }
}
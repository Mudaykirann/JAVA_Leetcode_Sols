class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, n = nums.length, right;

        for (right = 0; right < n; right++) {
            if (nums[right] == 0)
                k -= 1;
            
            if (k < 0) {
                if (nums[left] == 0)
                    k += 1;
                
                left += 1;
            }
        }

        return right - left;
    }
}
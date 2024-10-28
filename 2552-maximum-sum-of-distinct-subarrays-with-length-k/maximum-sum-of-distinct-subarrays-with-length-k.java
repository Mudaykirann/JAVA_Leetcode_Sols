class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long currSum = 0; 
        int left = 0;
        int[] freq = new int[100001]; 
        int uniqueCount = 0;  

        for (int right = 0; right < nums.length; right++) {
            int r = nums[right];
            freq[r]++;
            currSum += r;

            if (freq[r] == 1) {
                uniqueCount++;  
            }

            if (right - left + 1 > k) {
                int l = nums[left];
                currSum -= l;
                freq[l]--;
                if (freq[l] == 0) {
                    uniqueCount--;  
                }
                left++;
            }

            if (right - left + 1 == k && uniqueCount == k) {
                ans = Math.max(ans, currSum);
            }
        }

        return ans;
    }
}
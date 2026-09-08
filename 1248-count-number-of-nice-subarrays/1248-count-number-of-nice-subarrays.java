class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }

        int l = 0;
        int oc = 0;
        int ts = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0) {
                oc++;
            }
            while (oc > k) {
                if (nums[l] % 2 != 0) {
                    oc--;
                }
                l++;
            }
            ts += (right - l + 1);
        }

        return ts;
    }
}
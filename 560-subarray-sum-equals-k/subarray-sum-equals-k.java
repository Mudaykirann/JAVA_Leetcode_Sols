class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int prefix_sum = 0;
        int N = nums.length;

        for (int i = 0; i < N; i++) {
            prefix_sum += nums[i];

            if (prefix_sum == k) {
                count++;
            }

            
            if (map.containsKey(prefix_sum - k)) {
                count += map.get(prefix_sum - k);
            }

            map.put(prefix_sum, map.getOrDefault(prefix_sum, 0) + 1);
        }

        return count;
    }
}
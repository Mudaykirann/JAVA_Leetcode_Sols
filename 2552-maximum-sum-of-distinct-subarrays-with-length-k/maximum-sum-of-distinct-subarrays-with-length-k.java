class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        int n = nums.length;
        long w_sum = 0;
        int start = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            w_sum+=nums[i];

            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

            if((i-start+1) == k){
                if(map.size() == k){
                    max = Math.max(w_sum, max);
                }

                w_sum-=nums[start];
                
                if(map.get(nums[start])<=1)
                map.remove(nums[start]);
                else
                map.put(nums[start], map.getOrDefault(nums[start],0)-1);

                start+=1;
            }
        }

        return max;
    }
}
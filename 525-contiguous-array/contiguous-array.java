class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i=0; i<n; i++){
            if(nums[i]==0) nums[i]=-1;
        }

        hp.put(0,-1);
        int ans = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            if(hp.containsKey(sum)){
                ans = Math.max(ans,i-hp.get(sum));
            }else hp.put(sum,i);
        }
        return ans;

    }
}
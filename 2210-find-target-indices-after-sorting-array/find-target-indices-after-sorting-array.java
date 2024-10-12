class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Sort the array
        int smaller = 0, count = 0;
        List<Integer> res = new ArrayList();
        for(int n: nums) {
            if(n < target) {
                smaller++;
            } else if(n == target) {
                count++;
            }
        }

        while(count-- > 0) {
            res.add(smaller++);
        }

        return res;
    }
}

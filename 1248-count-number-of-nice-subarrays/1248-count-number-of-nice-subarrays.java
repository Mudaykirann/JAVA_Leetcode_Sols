class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int c = 0;
        int cs = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            cs += nums[i]%2;
            
            if (map.containsKey(cs - k)) {
                c += map.get(cs - k);
            }
            
            map.put(cs, map.getOrDefault(cs, 0) + 1);
        }
        
        return c;
    }
}
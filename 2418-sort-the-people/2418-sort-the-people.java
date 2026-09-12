class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        
        // Selection sort approach: find the maximum height for each position and swap
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (heights[j] > heights[maxIdx]) {
                    maxIdx = j;
                }
            }
            
            // Swap the heights
            int tempHeight = heights[i];
            heights[i] = heights[maxIdx];
            heights[maxIdx] = tempHeight;
            
            // Swap the corresponding names to keep them aligned
            String tempName = names[i];
            names[i] = names[maxIdx];
            names[maxIdx] = tempName;
        }
        
        return names;
    }
}
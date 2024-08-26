class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;      
        
        int index = -1;
        int maxCount = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                count += mat[i][j];
            }
            
            if (maxCount < count) {
                maxCount = count;
                index = i;
            }
        }
        
        return new int[]{index, maxCount};
    }
}

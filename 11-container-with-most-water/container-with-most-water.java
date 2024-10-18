class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int j = height.length-1;
        int i = 0;
        while(i<j){
            if(height[i]<=height[j]){
                maxWater = Math.max(height[i]*(j-i),maxWater);
                i++;
            }else{
                maxWater = Math.max(height[j]*(j-i),maxWater);
                j--;
            }
        }
        return maxWater;
    }
}
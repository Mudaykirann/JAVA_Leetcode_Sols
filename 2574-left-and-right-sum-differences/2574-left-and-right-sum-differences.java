class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int[] answer = new int[nums.length];

        leftsum[0]=0;
        rightsum[nums.length-1]=0;

        int lsum=0;
        for(int i=1;i<nums.length;i++){
            lsum+=nums[i-1];
            leftsum[i]=lsum;
        }

        int rsum=0;
        for(int i=nums.length-2;i>=0;i--){
            rsum+=nums[i+1];
            rightsum[i]=rsum;
        }

        for(int i=0;i<nums.length;i++){
            answer[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return answer;
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;

            s++;
            e--;
        }

        s=0;
        e=k-1;
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;

            s++;
            e--;
        }

        s=k;
        e=nums.length-1;
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;

            s++;
            e--;
        }




        
    }
}
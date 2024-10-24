class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int result = Integer.MAX_VALUE;
        boolean found = false;

        for(int i = 0; i < nums1.length; i++) {
            if(binarySearch(nums2, nums1[i])) {
                result = Math.min(result, nums1[i]); 
                found = true;
            }
        }
        return found ? result : -1;
    }

    private static boolean binarySearch(int nums2[],int num){
        int l=0;
        int r=nums2.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums2[mid]==num) return true;
            else if(nums2[mid]<num){
                l=mid+1;
            }
            else r=mid-1;
        }
        return false;
    }
}
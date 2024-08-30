class Solution {
    public boolean canweplace(int[] stalls,int dist,int k){
        int cntcows = 1,last=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dist){
                cntcows++;
                last=stalls[i];
            }
            if(cntcows>=k) return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low=1,high=position[n-1]-position[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(canweplace(position,mid,m)) low = mid+1;
            else high=mid-1;
        }
        return high;
    }
}
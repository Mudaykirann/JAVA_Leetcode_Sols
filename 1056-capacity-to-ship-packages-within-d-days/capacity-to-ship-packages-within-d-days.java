class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0;
        for(int w : weights){
            l=Math.max(l,w);
            r+=w;
        }

        while(l<r){
            int mid = l+(r-l)/2;
            if(canShip(weights,days,mid)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public static boolean canShip(int[] weights,int D,int mid){
        int days=1,load=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+load > mid){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }

            if (days > D) {
                return false;
            }
        }
        return true;
    }
}
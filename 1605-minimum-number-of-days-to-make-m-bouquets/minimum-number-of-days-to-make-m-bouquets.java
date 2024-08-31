class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) return -1;
        
        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;
        
        for (int i = 0; i < bloomDay.length; i++) {
            maxEle = Math.max(maxEle, bloomDay[i]);
            minEle = Math.min(minEle, bloomDay[i]);
        }

        int low = minEle, high = maxEle,result=-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(bloomDay, mid, m, k)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return result;
    }

    public static boolean isValid(int[] arr, int mid, int m, int k) {
        int count = 0, noBouquets = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                count++;
                if (count == k) {
                    noBouquets++;
                    count = 0; 
                }
            } else {
                count = 0; 
            }
        }
        
        return noBouquets >= m;
    }
}

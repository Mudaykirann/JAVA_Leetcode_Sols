class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int sum=0;
        for(int i=0; i<k; i++)
        {
            sum = sum + cardPoints[i];
        }
        if( k == len) 
            return sum;
        int maxSum = sum;
        int l=k-1;
        int r = len-1;
        while( l>= 0)
        {
            sum = sum -cardPoints[l] + cardPoints[r];
            l--;
            r--;
            if( sum >maxSum) maxSum = sum;
        }
        return maxSum;

    }
}
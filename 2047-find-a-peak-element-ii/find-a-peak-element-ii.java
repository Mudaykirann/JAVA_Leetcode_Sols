class Solution {
    public int maxEle(int[][] arr,int col){
        int maxele = Integer.MIN_VALUE;
        int r=-1;
        for(int i=0;i<arr.length;i++){
            if(maxele < arr[i][col]){
                maxele = arr[i][col];
                r=i;
            }
        }
        return r;
    }
    public int[] findPeakGrid(int[][] mat) {
        int low=0,high=mat[0].length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = maxEle(mat,mid);
            int left = mid-1>=0 ? mat[row][mid-1]:-1;
            int right = mid+1<mat[0].length ? mat[row][mid+1]:-1;
            if(mat[row][mid]>left&&mat[row][mid]>right) return new int[]{row,mid};
            else if(mat[row][mid]<left) high=mid-1;
            else low=mid+1;
        }
        return new int[]{-1,-1};
    }
}
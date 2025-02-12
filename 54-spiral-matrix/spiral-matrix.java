class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left=0,bottom=n-1,right=m-1,top=0;
        ArrayList<Integer> arr = new ArrayList<>();


        while(top<=bottom && left<=right){

        for(int i=left;i<=right;i++){
            arr.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            arr.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            arr.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            arr.add(matrix[i][left]);
        }
        left++;
        }
        }
        return arr;
    }
}
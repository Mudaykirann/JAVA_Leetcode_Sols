class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1;
        int h=num;
        while(l<=h){
            int mid = (l+h)/2;
            long square = (long) mid*mid;
            if(square == num) return true;
            else if(square < num) l=mid+1;
            else h=mid-1;
        }
        return false;
    }
}
import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] arr = new int[length * 2];
        
        for (int i = 0; i < length; i++) {
            arr[i] = nums[i];
            arr[i + length] = nums[i];
        }

        return arr;
    }
}

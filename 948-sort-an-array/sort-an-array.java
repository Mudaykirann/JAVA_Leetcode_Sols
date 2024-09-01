class Solution {
    public int[] sortArray(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
 
        int k = max - min;
        int[] arr = new int[k + 1];

        for (int num : nums) {
            arr[num - min]++;
        }

        int ind = 0;

        for (int i = 0; i <= k; i++) {
            while (arr[i] > 0) {
                nums[ind] = min;
                ind++;
                arr[i]--;
            }

            min++;
        }

        return nums;
    }
}
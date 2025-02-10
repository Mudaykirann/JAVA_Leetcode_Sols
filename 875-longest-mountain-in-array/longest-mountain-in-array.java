class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0; 

        int maxLen = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i - 1, right = i + 1;
                int count = 1;

                while (left >= 0 && arr[left] < arr[left + 1]) {
                    count++;
                    left--;
                }

                while (right < n && arr[right] < arr[right - 1]) {
                    count++;
                    right++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}

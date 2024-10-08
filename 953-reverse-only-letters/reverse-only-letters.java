class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0, j = n-1;
        while(i<j) {
            while(i<j && !Character.isLetter(s.charAt(i))) i++;
            while(i<j && !Character.isLetter(s.charAt(j))) j--;
            if(i<j) {
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}
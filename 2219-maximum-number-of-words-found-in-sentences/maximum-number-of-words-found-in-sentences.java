class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] arr = new int[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            String[] s1 = sentences[i].split(" ");
            arr[i] = s1.length; // Assigning the length of the split array directly
        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    }
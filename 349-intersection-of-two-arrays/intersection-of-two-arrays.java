class Solution {
       public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> intersectionList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (intersectionList.isEmpty() || !intersectionList.get(intersectionList.size() - 1).equals(nums1[i])) {
                    intersectionList.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int[] result = new int[intersectionList.size()];
        for (int k = 0; k < intersectionList.size(); k++) {
            result[k] = intersectionList.get(k);
        }
        return result;
    }
}
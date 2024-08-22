class Solution {
       public int[] intersection(int[] nums1, int[] nums2) {


          Set<Integer> intersectionNums = new HashSet<>();
      Set<Integer> intersectionNums2 = new HashSet<>();

        for (int k : nums1) {
            intersectionNums.add(k);
        }


        for (int k : nums2) {
            if (intersectionNums.contains(k)) {
                intersectionNums2.add(k);
            }
            
        }
      

        int[] res = new int[intersectionNums2.size()];

        int i = 0;

        for (int num : intersectionNums2) {
            res[i++] = num;
        }

        return res;
    }
    }
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> occurances = new HashSet<>();
        for(int count : map.values()){
            if(!occurances.add(count))
                return false;
        }
        return true;
    }
}
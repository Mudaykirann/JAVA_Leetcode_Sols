class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int start = i;
            int end = s.lastIndexOf(s.charAt(i));

            for(int j=start+1;j<=end-1;j++){
                int nextIndex = s.lastIndexOf(s.charAt(j));

                if(nextIndex > end) end=nextIndex;
            }

            arr.add(end-start+1);
            i=end+1;
        }
        return arr;
    }
}
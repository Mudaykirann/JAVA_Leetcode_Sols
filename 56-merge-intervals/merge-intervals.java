class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> l = new ArrayList<>();
        l.add(arr[0]);

        for(int i=1;i<arr.length;i++){
            int[] last = l.get(l.size()-1);
            int[] curr = arr[i];


            if(curr[0]<=last[1]){
                last[1]=Math.max(last[1],curr[1]);
            }
            else{
                l.add(curr);
            }
        }

        return l.toArray(new int[l.size()][]);

    }
}
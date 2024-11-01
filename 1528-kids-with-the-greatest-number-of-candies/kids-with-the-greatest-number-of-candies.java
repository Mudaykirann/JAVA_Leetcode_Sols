class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxVal = Integer.MIN_VALUE;
        for (int candy : candies) {
            maxVal = Math.max(maxVal, candy);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxVal);
        }

        return result;
    }
}
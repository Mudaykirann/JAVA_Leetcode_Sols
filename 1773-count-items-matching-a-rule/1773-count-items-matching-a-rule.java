class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int rk = 0;
        if (ruleKey.equals("type")) rk = 0;
        else if (ruleKey.equals("color")) rk = 1;
        else if (ruleKey.equals("name")) rk = 2;
        
        int c = 0;

        for (int p = 0; p < items.size(); p++) {
            if (items.get(p).get(rk).equals(ruleValue)) {
                c++;
            }
        }
        return c;
    }
}
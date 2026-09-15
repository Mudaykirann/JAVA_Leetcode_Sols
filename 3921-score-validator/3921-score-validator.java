class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;

        for (String event : events) {
            if ("W".equals(event)) {
                counter++;
                if (counter == 10) {
                    break;
                }
            } else if ("WD".equals(event) || "NB".equals(event)) {
                score += 1;
            } else {
                score += Integer.parseInt(event);
            }
        }

        return new int[]{score, counter};
    }
}
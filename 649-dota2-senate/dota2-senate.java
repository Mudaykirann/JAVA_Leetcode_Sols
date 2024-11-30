import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                rad.add(i);
            } else {
                dir.add(i);
            }
        }

        while (!rad.isEmpty() && !dir.isEmpty()) {
            int radIndex = rad.poll();
            int dirIndex = dir.poll();

            if (radIndex < dirIndex) {
                rad.add(radIndex + n);
            } else {
                dir.add(dirIndex + n);
            }
        }
        return rad.isEmpty() ? "Dire" : "Radiant";
    }
}

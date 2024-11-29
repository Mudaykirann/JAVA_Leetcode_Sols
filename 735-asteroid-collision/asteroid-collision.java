class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> st = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean exploded = false;
            
            while (!st.isEmpty() && asteroid < 0 && st.peek() > 0) {
                if (Math.abs(asteroid) > st.peek()) {
                    st.pop();
                } else if (Math.abs(asteroid) == st.peek()) {
                    st.pop();
                    exploded = true;
                    break;
                } else {
                    exploded = true;
                    break;
                }
            }
            
            if (!exploded) {
                st.push(asteroid);
            }
        }
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}
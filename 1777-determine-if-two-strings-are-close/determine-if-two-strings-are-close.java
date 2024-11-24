class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        HashSet<Character> h1 = new HashSet<>();
        HashSet<Character> h2 = new HashSet<>();

        for (char c : word1.toCharArray()) h1.add(c);
        for (char c : word2.toCharArray()) h2.add(c);

        if (!h1.equals(h2)) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : word1.toCharArray()) freq1[c - 'a']++;
        for (char c : word2.toCharArray()) freq2[c - 'a']++;

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);

    }
}
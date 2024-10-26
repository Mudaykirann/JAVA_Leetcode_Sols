class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()) return List.of();

        List<Integer> res=new ArrayList<>();
        int n = p.length();
        int[] freq1 = new int[26],freq2=new int[26];

        for(int i=0;i<n;i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(freq1,freq2)) res.add(0);

        for(int i = n; i < s.length(); ++i) {
            freq2[s.charAt(i - n) - 'a']--;
            freq2[s.charAt(i) - 'a']++;


            if(Arrays.equals(freq1, freq2))
                res.add(i - n + 1);
        }

  
        return res;
    }
}
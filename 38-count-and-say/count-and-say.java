class Solution {
    public String countAndSay(int n) {
        List<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("11");
        for(int i = 2 ; i<n;i++)
        {
            String s = arr.get(i-1);
            String result = "";
            for(int j =0;j<s.length();j++)
            {
                char ch = s.charAt(j);
                int count = 1;

                while(j<s.length()-1 && ch == s.charAt(j+1))
                {
                    count++;
                    j++;
                }

                result =result+ count + ch;
            }
            arr.add(result);
        }
        return arr.get(n-1);
    }
}
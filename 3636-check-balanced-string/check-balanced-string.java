class Solution {
    public boolean isBalanced(String num) {
         int oddSum = 0;
        int evenSum = 0;
        
        for (int i = 0; i < num.length(); i++) {
            int ch = Character.getNumericValue(num.charAt(i));
            
            if (i % 2 != 0) {
                oddSum += ch; 
            } else {
                evenSum += ch; 
            }
        }
        
        return oddSum == evenSum;
    }
}
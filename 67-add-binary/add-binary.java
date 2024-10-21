import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
       BigInteger i = new BigInteger(a, 2); 
        BigInteger j = new BigInteger(b, 2);
         BigInteger sum = i.add(j);
      return sum.toString(2);
    }
}
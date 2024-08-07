import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
        // Integer n1=Integer.parseInt(num1);
        BigInteger n1=new BigInteger(num1);
         BigInteger n2=new BigInteger(num2);
         BigInteger add=n1.add(n2);
         String s3=add.toString();
         return s3;
    }
}
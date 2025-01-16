class Solution {

    public int xorAllNums(int[] a, int[] b) {
        /*
        example:
        a: a1, a2, a3 <- length of m
        b: b1, b2 <- length of n
        => a1 ^ b1, a1 ^ b2, a2 ^ b1, a2 ^ b2, a3 ^ b1, a3 ^ b2
        => (a1 ^ a1) ^ (a2 ^ a2) ^ (a3 ^ a3) ^ (b1 ^ b1 ^ b1) ^ (b2 ^ b2 ^ b2)
        => 0 ^ 0 ^ 0 ^ b1 ^ b2

        algorithm:
        if n is even, discard a
        else xor all elements in a and store the result
        
        if m is even, discard b
        else xor all elements in b and store the result  
        */

        final int m = a.length, n = b.length;
        int aXor = n % 2 == 0 ? 0 : xor(a);
        int bXor = m % 2 == 0 ? 0 : xor(b);

        return aXor ^ bXor;
    }

    private int xor(int[] arr) {
        int xor = 0;

        for (int n : arr) {
            xor ^= n;
        }

        return xor;
    }

}
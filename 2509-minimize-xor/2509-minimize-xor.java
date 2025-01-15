public class Solution {
    // Helper function to create a number with 'bitsCount' set bits from MSB
    private int generateNumberWithBits(int num, int bitsCount) {
        int result = 0;
        int count = 0;
        int numBits = 32; // Maximum bits for integers

        // Iterate from MSB to LSB
        for (int i = numBits - 1; i >= 0; i--) {
            if ((num & (1 << i)) != 0) { // Check if the bit is set
                result |= (1 << i); // Set the bit in result
                count++;
                if (count == bitsCount) {
                    break; // Stop after required bits
                }
            }
        }

        return result;
    }

    // Main function to minimize XOR by matching set bits with num2
    public int minimizeXor(int num1, int num2) {
        int bits2 = Integer.bitCount(num2); // Count set bits in num2
        int bits1 = Integer.bitCount(num1); // Count set bits in num1

        if (bits1 == bits2) {
            return num1;
        }
        if (bits1 > bits2) {
            return generateNumberWithBits(num1, bits2);
        } else {
            int result = generateNumberWithBits(num1, bits1);
            int diff = bits2 - bits1;

            // Add remaining set bits from LSB
            for (int i = 0; i < 32 && diff > 0; i++) {
                if ((result & (1 << i)) == 0) { // If the bit is not set
                    result |= (1 << i); // Set the bit
                    diff--;
                }
            }
            return result;
        }
    }

}
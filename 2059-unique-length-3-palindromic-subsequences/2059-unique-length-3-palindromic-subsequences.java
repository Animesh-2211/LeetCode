class Solution {
    public int countPalindromicSubsequence(String s) {
        // int n = s.length();
        // Set<String> palindromes = new HashSet<>();
        
        // // Iterate over the string and treat each character as the middle character of a palindrome
        // for (int i = 1; i < n - 1; i++) {
        //     char middle = s.charAt(i);
        //     Set<Character> leftSet = new HashSet<>();
        //     Set<Character> rightSet = new HashSet<>();
            
        //     // Collect characters on the left of the current middle character
        //     for (int j = i - 1; j >= 0; j--) {
        //         leftSet.add(s.charAt(j));
        //     }
            
        //     // Collect characters on the right of the current middle character
        //     for (int k = i + 1; k < n; k++) {
        //         rightSet.add(s.charAt(k));
        //     }
            
        //     // Check if any character exists in both the left and right sets
        //     for (char c : leftSet) {
        //         if (rightSet.contains(c)) {
        //             // Add the unique palindrome to the set
        //             palindromes.add("" + c + middle + c);
        //         }
        //     }
        // }
        
        // // The size of the set is the number of unique palindromic subsequences
        // return palindromes.size();
    

     int n = s.length();
        int count = 0;

        // Iterate over 'a' to 'z' for the outer characters
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int left = 0, right = n - 1;

            // Find the first occurrence of 'ch' from the left
            while (left < n && s.charAt(left) != ch) {
                left++;
            }

            // Find the last occurrence of 'ch' from the right
            while (right >= 0 && s.charAt(right) != ch) {
                right--;
            }

            // If left and right are valid and there's space in between for a middle character
            if (left < right) {
                // Use a set to count unique middle characters between the two 'ch'
                Set<Character> middleChars = new HashSet<>();
                for (int i = left + 1; i < right; i++) {
                    middleChars.add(s.charAt(i));
                }
                // Add the number of unique middle characters for this outer 'ch'
                count += middleChars.size();
            }
        }

        return count;
    }
}
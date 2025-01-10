class Solution {
        private int[] countFrequency(String word) {
        int[] count = new int[26]; // Array to store frequency of letters 'a' to 'z'
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }
    
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        int[] maxFreq = new int[26];
        
      
        for (String b : words2) {
            int[] freq = countFrequency(b);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        
        // List to store the universal strings
        List<String> result = new ArrayList<>();
        
        // For each word in words1, check if it's a universal string
        for (String a : words1) {
            int[] freqA = countFrequency(a);
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freqA[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                result.add(a);
            }
        }
        
        return result;
    }
}
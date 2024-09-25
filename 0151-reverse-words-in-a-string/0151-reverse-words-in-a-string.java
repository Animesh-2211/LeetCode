class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split("\\s+");
        int left = 0;
        int right = words.length - 1;
        
        while (left < right) {
            // Swap the words at left and right indexes
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            
            // Move the pointers closer to each other
            left++;
            right--;
        }
        
        // Join the words back into a single string
        return String.join(" ", words);
    }
}
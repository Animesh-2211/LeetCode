class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int maxLen = 1;  // At least each element is a subarray of length 1
        int inc = 1;     // Length of current increasing subarray
        int dec = 1;     // Length of current decreasing subarray
        
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;  // Reset decreasing subarray
            } else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;  // Reset increasing subarray
            } else {
                // Reset both if nums[i] == nums[i - 1]
                inc = 1;
                dec = 1;
            }
            
            // Update max length so far
            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }
        
        return maxLen;
    }
}
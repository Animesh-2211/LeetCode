class Solution {
    public int majorityElement(int[] nums) {

        // MOORE VOTING ALGORITHM

        int candidate = 0;
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            }

            else {
                count--;
            }
        }

        // return candidate; we can stop here only the code will work but we should also
        // verify according to this algo

        count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == candidate) {
                count++;
            }
        }

        if (count > (n / 2)) {
            return candidate;
        }

        return -1;

    }
}
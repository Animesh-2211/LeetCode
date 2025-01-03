class Solution {
    public int waysToSplitArray(int[] nums) {
        //find sum for full array
         int n=nums.length;
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }

         long prefixsum=0;
        int count=0;

        for(int i=0;i<n-1;i++){
            prefixsum +=nums[i];
            if(prefixsum>= sum-prefixsum){
                count++;
            }
        }
        return count;

    }
}
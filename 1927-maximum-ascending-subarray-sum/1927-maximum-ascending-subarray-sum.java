class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            if(i==0 ||nums[i]>nums[i-1]){
                sum +=nums[i];
                // max=Math.max(sum,max);
            }
            else{
            max=Math.max(sum,max);
            sum=nums[i];
            }
        }
        return Math.max(max, sum);
    }
}
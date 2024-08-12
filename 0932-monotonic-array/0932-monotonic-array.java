class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean asc=true;
        boolean desc=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                asc=false;
            }
        }
             for(int i=0;i<nums.length-1;i++){
               if(nums[i]>nums[i+1]){
                desc=false;


    }
}
    return asc || desc;


    }}
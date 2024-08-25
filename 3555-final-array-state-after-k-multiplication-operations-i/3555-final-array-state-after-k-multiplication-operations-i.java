class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
    
        int f=0;

          while(f<k){
        int min=0;
        for( int i=1;i<nums.length;i++){
           
            if(nums[i]<nums[min]){
                min=i;
            }
        }
             nums[min]=nums[min]*multiplier;
                f++;
          }
            
              
        
        
        return  nums;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
         int arr[]=new int[2];
         int ans=0;

         HashMap<Integer,Integer> mp=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            ans=nums[i];
            int left=target-ans;
            if(mp.containsKey(left)){
                arr[0]=i;
                arr[1]=mp.get(left);
                 return arr;
            }
            mp.put(nums[i],i);
         }
         return arr;
    }
}
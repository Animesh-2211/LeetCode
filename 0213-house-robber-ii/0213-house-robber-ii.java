import java.util.ArrayList;

class Solution {
    public int rob(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();

        int n=nums.length;
        if(n==1){
            return nums[0];
        }

        for(int i=0;i<n;i++){
             if(i != 0)
                arr1.add(nums[i]);
            if(i != n-1)
                arr2.add(nums[i]);
            
        }
         long ans1 = solve(arr1);
        long ans2 = solve(arr2);
        return (int)Math.max(ans1,ans2);
    }

    static long solve(ArrayList<Integer>nums){
        int n=nums.size();
        long prev=nums.get(0);
        long prev2=0;

        for(int i=1;i<n;i++){
            long pick = nums.get(i);
            if(i>1){
                pick += prev2;
            }
            long nonpick=0+prev;
        

        long curr=Math.max(pick,nonpick);
        prev2=prev;
        prev=curr;

        }
    
    return prev;
}
}
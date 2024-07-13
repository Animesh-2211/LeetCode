import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(mp.containsKey(nums[i])){
                    mp.put (nums[i],mp.get(nums[i])+1);
                }
                else{
                    mp.put(nums[i],1);
                }
            }
            int majority=nums.length/2;
            for( int num:nums){
                if(mp.get(num)>majority){
                    count=num;
                    break;
                }
            }
            return count;
        }
    }

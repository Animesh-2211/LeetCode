class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ;i< nums1.length;i++ )
        {
             int max = -1;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    for(int z = j+1 ; z< nums2.length;z++){
                        if(nums2[z] > nums2[j]){
                            max = nums2[z];
                            break;
                        }
                        
                    }
                    break;
                }
            }
            arr.add(max);
                
        }
            
            int ani[] = new int[arr.size()];
            for(int i =0;i<arr.size();i++){
                  ani[i] = arr.get(i);
            }

        
        return ani;
    }
}
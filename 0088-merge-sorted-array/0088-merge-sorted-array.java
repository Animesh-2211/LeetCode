class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int index = m-1;
         int point = n-1;
         int co = m+n-1;

         while(index>=0 && point>=0){
            if(nums1[index] > nums2[point]){
                nums1[co--] = nums1[index--];
            }
            else{
                nums1[co--] = nums2[point--];
            }
         }
         while(point>=0){
            nums1[co--] = nums2[point--];
         }
    }
}
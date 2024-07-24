class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    //     int index=0;
    //     int point=0;
    //     for(int i=m;i<nums1.length;i++){
    //         nums1[i]=nums2[point++];
    //     }
    //     Arrays.sort(nums1);
        
        
    // }

    int index=m-1;int point=n-1;
    int mergeindex=m+n-1;

    while(index >= 0 && point>=0){
        if(nums1[index]> nums2[point]){
            nums1[mergeindex--]=nums1[index--];
        }
        else{
        {
            nums1[mergeindex--]=nums2[point--];
        }
        }

      

    }
      while(point>=0){
            nums1[mergeindex--]=nums2[point--];
        }
}
}
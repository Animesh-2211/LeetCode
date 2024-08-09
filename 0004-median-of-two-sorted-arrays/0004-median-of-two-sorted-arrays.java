class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n=nums1.length;
         int m=nums2.length;
        
         int merged[]=new int[m+n];
         int i=0;int j=0;
         int b=0;

        //  if(m ==0){
        //     if(n%2==0){
        //         return (nums1[n/2 -1] +nums1[n/2])/2.0;
        //     }else{
        //         return nums1[n/2];
        //     }
        //  }

        //    if(n ==0){
        //     if(m%2==0){
        //         return (nums2[m/2 -1] +nums2[m/2])/2.0;
        //     }else{
        //         return nums2[m/2];
        //     }
        //  }

         while(i<n && j<m){

            if(nums1[i]<=nums2[j]){
                merged[b++]=nums1[i++];
                
            }
            else{
                 merged[b++]=nums2[j++];

            }

         }

         while(i<n){
            merged[b++]=nums1[i++];
            
         }

          while(j<m){
            merged[b++]=nums2[j++];
           
         }

         //find if two middle element or  1
        int total=merged.length;
        if(total %2==0){
            return (merged[total/2 - 1] +merged[total/2])/2.0;

        }
        else{
            return merged[total/2];
        }
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;

            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
                
            }
        }
    }

    public void swap(int arr[],int nn,int b){
        int temp=arr[nn];
        arr[nn]=arr[b];
        arr[b]=temp;
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        
           if(pq.size()>k){
            pq.poll();

           }
           }
           return pq.peek();






    //     for(int i=k;i<nums.length;i++)
        
    //     {
    //         if(pq.peek()<nums[i]){
    //             pq.poll();
    //             pq.add(nums[i]);
    //         }
    //     }
    //       return pq.peek();
     }
}
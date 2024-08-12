class KthLargest {






        PriorityQueue<Integer> min=new PriorityQueue<>();
        private int k;
    public KthLargest(int k, int[] nums) {

        this.k=k;
        min= new PriorityQueue<>(k);


        for(int num:nums){
           add(num);
        }
        
    }
    
    public int add(int val) {

        if(min.size()<k){
            min.offer(val);
        }else if(min.peek()< val){
            min.poll();
            min.offer(val);
        }
        return min.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
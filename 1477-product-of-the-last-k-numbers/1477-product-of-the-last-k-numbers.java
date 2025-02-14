class ProductOfNumbers {

    List<Integer> prefixSum;
    public ProductOfNumbers() {
        prefixSum = new ArrayList<>();
    }
    
    public void add(int num) {
        if(num == 0)
            prefixSum = new ArrayList<>();
        else if(prefixSum.size() == 0)
            prefixSum.add(num);
        else{
            prefixSum.add(prefixSum.get(prefixSum.size()-1) * num);
        }
    }
    
    public int getProduct(int k) {
        int size = prefixSum.size();
        if(k > size)
            return 0;
        if(k == size){
            return prefixSum.get(size-1);
        } else
            return (int)(prefixSum.get(size-1)/prefixSum.get(size-k-1));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
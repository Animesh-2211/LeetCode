class Solution {
    public int tupleSameProduct(int[] nums) {
        int len=nums.length;
        int count =0;
        Map<Integer,Integer> mymap=new HashMap<>();
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                int num=nums[i]*nums[j];
                 mymap.put(num, mymap.getOrDefault(num, 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mymap.entrySet()) {
            if(entry.getValue()>=2){
                int n=entry.getValue();
                count+=4*n*(n-1);
            }
        }
        return count;
    }
}
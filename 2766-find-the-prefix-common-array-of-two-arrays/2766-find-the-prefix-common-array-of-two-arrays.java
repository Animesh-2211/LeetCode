class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        Set<Integer> cache=new HashSet<>();
        int[] res=new int[A.length];
        for(int i=0;i<A.length;i++){
            cache.add(A[i]);
            cache.add(B[i]);

            res[i]=(2*(i+1))-cache.size();
        }
        return res;
        
    }
}
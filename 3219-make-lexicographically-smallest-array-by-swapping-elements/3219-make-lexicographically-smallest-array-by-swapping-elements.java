class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] clone = nums.clone();
        Arrays.sort(clone);
        int n = nums.length;
        int[][] pairs = new int[n][2];
        for(int i = 0;i<n;i++){
            pairs[i][0] =nums[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a, b)->a[0]-b[0]);
        int i = 0;
        int j = 0;
        int[] ans = new int[n];
        while(i<n){
            j = i;
            while(i<n-1 && pairs[i+1][0]-pairs[i][0]<=limit){
                i++;
            }
            int[] dom = new int[i-j+1];
            int p = 0;
            for(int k = j; k<=i; k++){
                dom[p]=pairs[k][1];
                p++;
            }
            Arrays.sort(dom);
            int s = j;
            for(int o = 0;o<dom.length;o++){
                ans[dom[o]]=pairs[s][0];
                s++;
            }
            i++;
        }
        return ans;
    }
}
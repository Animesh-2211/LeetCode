class Solution {
    public int[] minOperations(String boxes) {
         int[] res = new int[boxes.length()];
        //Brute Force: 
        //TC -> O(N^2), SC -> O(1)
        // for(int i=0;i<res.length;++i)
        // {
        //     int sum = 0;
        //     for(int j=0;j<boxes.length();++j)
        //     {
        //         if(boxes.charAt(j)=='1')
        //             sum += Math.abs(j-i);
        //     }
        //     res[i] = sum;
        // }

        //Optimal
        int len = boxes.length();

        int[] right = new int[len];
        int[] left = new int[len];
        
        int l = (int)(boxes.charAt(len-1)-'0'), r = (int)(boxes.charAt(0)-'0');
         
        for(int i=1;i<len;++i)
        {
            right[i] += right[i-1] + r;
            r += (int)(boxes.charAt(i)-'0');  
        }
        for(int i=len-2;i>=0;--i)
        {
            left[i] += left[i+1] + l; 
            l += (int)(boxes.charAt(i)-'0');  
        }

        for(int i=0;i<len;++i)
        {
            res[i] = right[i] + left[i];
        }
        return res;
    }
}
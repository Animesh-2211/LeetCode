class Solution {
    public int maxScore(String s) {
        int one=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                one++;
            }
        }
        int zero=0;
        int total=0;

        for(int j=0;j<n-1;j++){
            if(s.charAt(j)=='1')
            {
                one--;
            }
            else{
                zero++;
            }

            total=Math.max(total,zero+one);
        }
        return total;
        
    }
}
class Solution {
    public static int sumdigit(int n){
        int sum=0;
        while(n>0){
            sum +=(n%10);
            n/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int arr[] = new int[82];
        int ans=-1;
        for(int number : nums){
            int digitsum= sumdigit(number);
            if(arr[digitsum] >0 ){
                int old = arr[digitsum];
                ans = Math.max(old+number ,ans);
                arr[digitsum] = Math.max(old, number);
            }else{
                arr[digitsum]=number;
            }

        }
        return ans;
    }
}
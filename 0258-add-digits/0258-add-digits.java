class Solution {
    public int addDigits(int num) {
        int sum=0,rem;
        while(true){
            while(num>0){
                rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            if(sum<10){
                return sum;
            }
        num=sum;
        sum=0;
        }
    }
}
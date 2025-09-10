class Solution {
    public void reverseString(char[] s) {
        int left =0;
        int right= s.length-1;

        while(left<right){
            swap(left,right,s);
            right--;
            left++;
        }
    }
        public void swap(int left,int right,char[] s){
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;
        }
        
    
}
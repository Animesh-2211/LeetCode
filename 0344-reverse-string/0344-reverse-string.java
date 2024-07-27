class Solution {
    public void reverseString(char[] s) {
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length;i++){
        //     st.add(s[i]);
        // }
        // for(int j=0;j<s.length;j++){
        //     s[j]=st.pop();
        // }
        
    
     int n=s.length;
    int left=0;
    int right=n-1;
    
    while(left <right){
        swap(s,left,right);
        left++;
        right--;
    }
    
    }

    public void swap( char[] s,int a,int b){
        char ch=s[a];
        s[a]=s[b];
        s[b]=ch;
    }
}
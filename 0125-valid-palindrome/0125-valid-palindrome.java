class Solution {
    public boolean isPalindrome(String s) {
        // s=s.replaceAll("\\s","");
        // s=s.replaceAll(",","");
        // s=s.replaceAll(":","");
    //     s=s.replaceAll("[^A-Za-z0-9]","");
    //     s=s.toLowerCase();
    //     StringBuilder str=new StringBuilder(s);
    //     str=str.reverse();
    //     // str.toString();
    //     return s.equals(str.toString()); 
 
    int n=s.length();
    int left=0;
    int right=s.length()-1;

    while(left<right){

        while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }

         while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }

        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
        }
        left++;
        right--;
    }
        return true;

}
}
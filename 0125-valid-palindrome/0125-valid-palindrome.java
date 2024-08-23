class Solution {
    public boolean isPalindrome(String s) {
        // s=s.replaceAll("\\s","");
        // s=s.replaceAll(",","");
        // s=s.replaceAll(":","");
        s=s.replaceAll("[^A-Za-z0-9]","");
        s=s.toLowerCase();
        StringBuilder str=new StringBuilder(s);
        str=str.reverse();
        // str.toString();
        return s.equals(str.toString()); 
    }
}
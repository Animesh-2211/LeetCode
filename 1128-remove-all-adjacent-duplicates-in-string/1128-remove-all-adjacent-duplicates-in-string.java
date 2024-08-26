class Solution {
    public String removeDuplicates(String s) {
        char[] ch=new char[s.length()];
        int length=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(length>0 && ch[length-1]==c){
                length--;
            }else{
                ch[length++]=c;
            }

        }
        return new String(ch,0,length);
    }
}
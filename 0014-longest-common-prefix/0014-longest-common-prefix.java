class Solution {
    public String longestCommonPrefix(String[] strs) {


        if(strs.length==1){
            return strs[0];
        }
        
       Arrays.sort(strs);
       String a =strs[0];
       String b=strs[strs.length-1];
       int index=0;

       while(index<a.length()){
        if(a.charAt(index)==b.charAt(index)){
            index++;

        }
        else{
            break;
        }
       }

       return index==0? "" :a.substring(0,index);
        
    }
}
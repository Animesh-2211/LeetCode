class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
               if( isValid(words[i],words[j])){
                count++;
               }
            }
        }
        return count;


    }
    public boolean  isValid(String a,String b){
        int len=a.length();
          if(b.length()<len){
            return false;
          }
      
        String st=b.substring(0,len);
        String sb=b.substring(b.length()-len);

        if(st.equals(a) && sb.equals(a)){
            return true;
        }
        return false;
    }
}
class Solution {
    public int prefixCount(String[] words, String pref) {
      int count=0;
      int len=pref.length();
      for(int i=0;i<words.length;i++){
        if(words[i].length()>=len){
         String st=words[i].substring(0,len);
         if(st.equals(pref)){
            count++;
         }
      }
      }
      return count;
    }
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

      HashMap<Integer,Integer> mp=new HashMap<>();

      for(int i=0;i<arr.length;i++){
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);    
    }

      HashSet<Integer> set=new HashSet<>();


    for(int freq:mp.values()){
     
      if(!set.add(freq)){
        return false;
      }

    }
    return true;
        
    }
}
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list=new ArrayList<>();
        int size=words.length;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){

                if(i!=j && words[j].contains(words[i])){
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }
}
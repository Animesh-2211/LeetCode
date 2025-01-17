class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int total=0;
        for(int i=0;i<derived.length;i++){
            total^=derived[i];

        }
        return(total==0);
    }
}
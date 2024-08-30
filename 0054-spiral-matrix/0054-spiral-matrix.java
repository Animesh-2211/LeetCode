class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> mp=new ArrayList<>();

         if (matrix.length == 0) {
      return mp;
    }

        int rowbegin=0;
        int rowend=matrix.length-1;
        int colbegin=0;
        int colend=matrix[0].length-1;

        while(rowbegin <= rowend && colbegin <= colend){

        for(int j=colbegin;j<=colend;j++){
          mp.add(matrix[rowbegin][j]);

       }
          rowbegin++;
          
           for(int j=rowbegin;j<=rowend;j++){
          mp.add(matrix[j][colend]);

    }
         colend--;
      if(rowbegin<=rowend){
       for(int j=colend;j>=colbegin;j--){
          mp.add(matrix[rowend][j]);

    }
    }
    rowend--;
      if(colbegin<=colend){
     for(int j=rowend;j>=rowbegin;j--){
          mp.add(matrix[j][colbegin]);
}
    }
    colbegin++;
}
     return mp;
}
}
class Solution {
    int[] parent;

    public int find(int node){
        if(node==parent[node])return node;
        int par = find(parent[node]);

        //Keep updating the parent for quick search
        parent[node] = par;
        return par;
    }

    public boolean unionAndCycleExists(int i, int j){
        int p1 = find(i);
        int p2 = find(j);

        // If cycle exist parents will be same
        if(p1==p2)return true;
        else{//else update the parent to smallest one
            if(p1<p2){
                parent[j] = p1;
                parent[i] = p1;
                parent[p2] = p1;
            }else{
                parent[i] = p2;
                parent[j] = p2;
                parent[p1] = p2;
            }
        }
        return false;
    }

    public int[] findRedundantConnection(int[][] edges) {
        
        int n = edges.length;
        parent = new int[n+1];
        for(int i = 1; i <=n; i++)parent[i] = i;

        int[] ans = new int[2];

        for(int i = 0; i < n; i++){
            if(unionAndCycleExists(edges[i][0],edges[i][1])){
                ans[0] = edges[i][0];
                ans[1] = edges[i][1];
            }
        }

        return ans;
    }
}
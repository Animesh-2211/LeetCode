/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> postlist=new ArrayList<>();
         postorderTraversal(root,postlist);
         return postlist;

        
    }
    static  void postorderTraversal(TreeNode node,List<Integer> list){
        if(node==null){
            return;

        }
         
         postorderTraversal(node.left, list);
         postorderTraversal(node.right, list);
         list.add(node.val);
    }
}
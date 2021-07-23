package BinaryTreePruning;


class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
 
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        return dfs(root);
    }
    
    public TreeNode dfs(TreeNode root){
        if(root==null)
            return null;
        root.left = dfs(root.left);
        root.right = dfs(root.right);
        
        if(root.val==0 && root.left==null && root.right==null){
            root=null;
        }
        
        return root;
    }
    public TreeNode prune(TreeNode root){
        if(root.left==null && root.right==null && root.val==0){
            root=null;
        }
        return root;
    }
}

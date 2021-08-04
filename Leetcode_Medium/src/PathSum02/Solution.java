package PathSum02;

import java.util.LinkedList;
import java.util.List;

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
   List<List<Integer>> result = new LinkedList<>();
   static int t;
   public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       t=targetSum;
       dfs(root, new LinkedList<>(),0);
       
       return result;
   }
   
   public void dfs(TreeNode root,LinkedList<Integer> list,int sum){
       if(root==null)
           return;
       
       list.add(root.val);
       sum+=root.val;
       if(sum==t && root.left==null && root.right==null){
           result.add(list);
       }
       dfs(root.left, new LinkedList<>(list),sum);
       dfs(root.right, new LinkedList<>(list),sum);
   }
}

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def pruneTree(self, root: TreeNode) -> TreeNode:
        
        def dfs(root : TreeNode):
            if not root:
                return -1
            
            if root.val==0 and not root.left and not root.right:
                root = None
                return -1
            
            l=dfs(root.left)
            r=dfs(root.right)
            if l==-1:
                root.left=None
            if r==-1:
                root.right=None
            
            if l==-1 and r==-1 and root.val==0:
                root.left=None
                root.right=None
                root=None
                return -1
            
            return 1
        
        
        dfs(root)
        
        if root.val==0 and not root.left and not root.right:
            return None
        
        return root
        
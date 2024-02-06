Java: Using Recursion
//Creating a Mirror of the tree and the using recursion to compare the left & right SubTrees
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return recursion(root, root);
    }
    public boolean recursion(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && recursion(t1.left, t2.right) && recursion(t1.right,t2.left);
    }
}


Python: Using Recursion
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        return self.recursion(root, root)
    
    def recursion(self, t1: TreeNode, t2: TreeNode) -> bool:
        if t1 is None and t2 is None:
            return True            
        if t1 is None or t2 is None:
            return False    
        return (t1.val == t2.val) and self.recursion(t1.left, t2.right) and self.recursion(t1.right, t2.left)


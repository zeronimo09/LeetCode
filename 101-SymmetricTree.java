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

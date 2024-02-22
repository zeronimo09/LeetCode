Java: Using BinarySearch and Recursion
// when you see a Sorted Array then most likely we are going to use Binary search
  
  class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return constructTree(nums, 0, nums.length-1);
    }

    public TreeNode constructTree(int [] nums, int left, int right){
        if(left>right) return null;
        int mid = left + (right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = constructTree(nums, left, mid-1);
        node.right = constructTree(nums,mid+1, right);
        return node;

    }
}

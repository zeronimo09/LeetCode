Python:
Inorder - left, root, right
class Solution(object):
    def inorderTraversal(self, root):
        stack = []
        res = []
        curr = root
        while curr or stack:
            while curr:
                stack.append(curr)
                curr = curr.left
            curr = stack.pop()
            res.append(curr.val)
            curr = curr.right
        return res
        

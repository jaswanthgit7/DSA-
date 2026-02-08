import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> hs = new HashSet<>();
        return inorderTraversal(root, k, hs);
    }

    private boolean inorderTraversal(TreeNode node, int k, Set<Integer> hs) {
        if (node == null) {
            return false;
        }
        if (hs.contains(k - node.val)) {
            return true;
        }
        hs.add(node.val);
        return inorderTraversal(node.left, k, hs) || inorderTraversal(node.right, k, hs);
    }
}
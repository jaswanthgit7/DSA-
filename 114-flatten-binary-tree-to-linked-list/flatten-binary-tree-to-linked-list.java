class Solution {
    public void flatten(TreeNode root) {
        flattenTree(root, null);
    }

    /**
     * Flattens the tree rooted at `root` and connects it to `next`.
     *
     * Assumption / Contract:
     * flattenTree(root, next) will:
     * 1. Flatten the subtree rooted at `root` into a right-skewed linked list
     *    (following preorder traversal).
     * 2. Attach the resulting list in front of `next`.
     * 3. Return the head of this flattened list (which is `root`).
     *
     * In short:
     * It builds: root -> ...flattened subtree... -> next
     */
    private TreeNode flattenTree(TreeNode root, TreeNode next) {
        if (root == null) return next;
        next = flattenTree(root.right, next);
        next = flattenTree(root.left, next);
        root.right = next;
        root.left = null;
        return root;
    }
}
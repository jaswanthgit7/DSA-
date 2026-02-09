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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        inorder(root, al);

        return balance(al, 0, al.size() - 1);
    }

    public void inorder(TreeNode node, List<Integer> al) {
        if (node == null) return;

        inorder(node.left, al);
        al.add(node.val);
        inorder(node.right, al);
    }

    public TreeNode balance(List<Integer> al, int left, int right) {
        if (left > right) 
        return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(al.get(mid));

        node.left = balance(al, left, mid - 1);
        node.right = balance(al, mid + 1, right);

        return node;
    }
}
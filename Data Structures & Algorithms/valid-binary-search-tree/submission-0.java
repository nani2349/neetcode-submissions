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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> value = new ArrayList<>();

        inorder(root, value);

        for (int i = 1; i < value.size(); i++) {
            if (value.get(i) <= value.get(i - 1)) {
                return false;
            }
        }

        return true;
    }

    private void inorder(TreeNode root, ArrayList<Integer> value) {
        if (root == null) {
            return;
        }

        inorder(root.left, value);

        value.add(root.val);

        inorder(root.right, value);
    }
}

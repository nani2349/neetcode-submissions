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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        class Traverse{
            Traverse(TreeNode currentNode){
                result.add(currentNode.val);
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }

                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
            }
        }
        if(root!=null)
        new Traverse(root);
        return result;
        
    }
}
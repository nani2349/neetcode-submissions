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
    public List<Integer> postorderTraversal(TreeNode root) {
         ArrayList<Integer> result = new ArrayList<>();
        class Traverse{
            Traverse(TreeNode currentNode){
                
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }

                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
                result.add(currentNode.val);
            }
        }
        if(root!=null)
        new Traverse(root);
        return result;
        
    }
}
        


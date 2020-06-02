/*Invert a binary tree. (Similar to creating mirror image)

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
*/
/////////////////////////////////////////////////////////////////////////////////////
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
 //This approach uses recursion. The base condition is: it should return when it reaches a leaf node
class Solution {
    void TreeMirror(TreeNode node){
        if(node == null){       
            return;
        }
        else{
            TreeNode temp;
            TreeMirror(node.left);
            TreeMirror(node.right);
            temp = node.right;      // swapping left and right child
            node.right = node.left;
            node.left = temp;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        TreeMirror(root);
        return root;
    }
    
}

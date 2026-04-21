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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> binary=new ArrayList<>();
        if(root==null) return binary;
        if(root.left==null && root.right==null){
              binary.add(""+root.val);
              return binary;
        }

        List<String> n=binaryTreePaths(root.left);
        List<String> m=binaryTreePaths(root.right);
        for(String s:n){
            binary.add(root.val+"->"+s);

        }
        for(String s:m){
            binary.add(root.val+"->"+s);
        }

        return binary;
    }
    
}
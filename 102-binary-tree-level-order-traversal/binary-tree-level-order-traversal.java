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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> ans=new ArrayList<>();
       if(root==null) return ans;
       Queue<TreeNode> q1=new LinkedList<>();

       q1.offer(root);
       while(!q1.isEmpty()){
        int size = q1.size();
        List<Integer> level = new ArrayList<>();
        for(int i=0;i<size;i++){

        TreeNode curr=q1.poll();
        level.add(curr.val);
            
         if(curr.left!=null)  q1.offer(curr.left);
         if(curr.right!=null) q1.offer(curr.right);

       }
       ans.add(level);
       }
       return ans;

    }
}
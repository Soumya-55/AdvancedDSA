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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            int size=q1.size();
            int last=0;
           for(int i=0;i<size;i++){
            TreeNode curr=q1.poll();
            last=curr.val;
            if(curr.left!=null) q1.add(curr.left);
            if(curr.right!=null) q1.add(curr.right);

           }
           result.add(last);

        }
        return result;
      
        


        
        
    }
}
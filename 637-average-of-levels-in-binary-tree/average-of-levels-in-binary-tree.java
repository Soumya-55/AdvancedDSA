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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> avg=new ArrayList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++){
            TreeNode tree=q.poll();
            sum+=tree.val;

            if(tree.right !=null) q.add(tree.right);
            if(tree.left !=null) q.add(tree.left);
        }
        avg.add(sum*1.0/size);
        }
    return avg;    
    }
}
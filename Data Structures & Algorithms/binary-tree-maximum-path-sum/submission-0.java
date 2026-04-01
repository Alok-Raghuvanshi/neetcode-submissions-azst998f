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
    public int maxPathSum(TreeNode root) {
        int a[]=new int[1];a[0]=Integer.MIN_VALUE;
        int ans=max(a,root);
        return a[0];
    }
    int max(int a[],TreeNode root)
    {
        if(root==null) return 0;
        int leftsum=max(a,root.left);
        if(leftsum<0) leftsum=0;
        int rightsum=max(a,root.right);
        if(rightsum<0) rightsum=0;
            a[0]=Math.max(leftsum+rightsum+root.val,a[0]);
        
        return root.val+Math.max(leftsum,rightsum);
        }
}

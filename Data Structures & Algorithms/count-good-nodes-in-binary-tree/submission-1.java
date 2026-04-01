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
  //without global variable
    public int goodNodes(TreeNode root) {

      if(root==null) return 0;
      int ans= dfs(root,-101);  
       return ans; 
    }
    int  dfs(TreeNode root,int max)
    {
        int c=0;
        if(root==null) return 0;
        if(root.val>=max)
        {
            c=1;
            max=root.val;
        }
         c+=dfs(root.left,max);
          c+=dfs(root.right,max);
          return c;
        }
    }


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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<inorder.length;i++)
       {
        map.put(inorder[i],i);
       } 
       TreeNode root=buildtree(preorder,inorder,0,preorder.length-1,0,inorder.length-1,map);
       return root;
    }
    TreeNode buildtree(int pre[],int in[],int sp,int ep,int sin,int ein,HashMap<Integer,Integer>map)
    {
      if(sp>ep||sin>ein) return null;
      TreeNode root=new TreeNode(pre[sp]);
      int index_root=map.get(pre[sp]);
      int left=index_root-sin;
      root.left=buildtree(pre,in,sp+1,sp+left,sin,index_root-1,map);
      root.right=buildtree(pre,in,sp+left+1,ep,index_root+1,ein,map);
      return root;
    }
}

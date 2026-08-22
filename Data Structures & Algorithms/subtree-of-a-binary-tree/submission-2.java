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
    public boolean equal(TreeNode parent,TreeNode child){
        if( parent==null && child==null)
         return true;
        if(parent==null || child==null || parent.val!=child.val)
         return false;
        return equal(parent.right,child.right) && equal(parent.left,child.left);

    }
    public boolean find(TreeNode parent,TreeNode child){
        if(parent==null)
         return false;
        if(parent.val!=child.val){
            boolean f1=find(parent.right,child);
            boolean f2=find(parent.left,child);
            return f1 || f2;
        }
         boolean s1=equal(parent.right,child.right);
          boolean s2=equal(parent.left,child.left);
          return (s1 && s2) || find(parent.right,child) ||find(parent.left,child) ;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
          TreeNode parent=root;
          TreeNode child=subRoot;
          boolean sub=find(root,subRoot);
          return sub;
    }
}

/**

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).


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
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size= q.size();
            LinkedList<Integer> r = new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                if(q.peek().left!=null)q.add(q.peek().left);
                if(q.peek().right!=null)q.add(q.peek().right);
                r.add(q.poll().val);
            }
            res.add(r);
        }
        return res;
    }
}

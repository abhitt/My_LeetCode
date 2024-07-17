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
    List<TreeNode> res = new ArrayList();
    private TreeNode solve(TreeNode root, boolean is_root, Set<Integer> set){
        if(root==null){
            return null;
        }

        boolean del = set.contains(root.val);
        if(is_root && !del) {
            res.add(root);
        }

        root.left = solve(root.left, del, set);
        root.right= solve(root.right, del, set);
        return del ? null : root;
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>();
        for(int td: to_delete) {
            set.add(td);
        }

        res = new ArrayList<>();
        solve(root, true, set);
        return res;
    }
}
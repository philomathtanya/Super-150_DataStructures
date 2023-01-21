package Tree;
public class Diameter_of_Binary_Tree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int ld = diameterOfBinaryTree(root.left);
            int rd = diameterOfBinaryTree(root.right);
            int sd = Height(root.left) + Height(root.right) + 2;
            return Math.max(ld, Math.max(rd, sd));

        }

        private int Height(TreeNode node) {
            // TODO Auto-generated method stub
            if (node == null) {
                return -1;
            }
            int lh = Height(node.left);
            int rh = Height(node.right);

            return Math.max(lh, rh) + 1;
        }

    }

}
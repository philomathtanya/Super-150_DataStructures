package Binary_Search_Tree;

import java.util.Scanner;

public class LargestBSTSubtree {
    public class Node {

        int val;
        Node left;
        Node right;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private Node root;

    public void  buildTree(int[] preorder, int[] inorder) {
        this.root=Create(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

    }

    private Node Create(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
        // TODO Auto-generated method stub
        if (ilo > ihi || plo > phi) {
            return null;
        }

        Node nn = new Node(preorder[plo]);
        int i = Search(inorder, ilo, ihi, preorder[plo]);
        int nel = i - ilo;
        nn.left = Create(preorder, plo + 1, plo + nel, inorder, ilo, i - 1);
        nn.right = Create(preorder, plo + nel + 1, phi, inorder, i + 1, ihi);

        return nn;

    }

    public int Search(int[] inorder, int si, int ei, int item) {

        for (int i = si; i <= ei; i++) {
            if (inorder[i] == item) {
                return i;
            }
        }
        return -1;

    }

    public class BstPair {
        boolean isbst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        int size = 0;

    }

    public int validbst() {
        return validbst(root).size;
    }

    public BstPair validbst(Node root) {
        if (root == null) {
            return new BstPair();
        }
        BstPair lbst = validbst(root.left);
        BstPair rbst = validbst(root.right);

        BstPair sbst = new BstPair();
        if (lbst.isbst == true && rbst.isbst == true && lbst.max < root.val && rbst.min > root.val) {
            sbst.isbst = true;
            sbst.max = Math.max(rbst.max, root.val);
            sbst.min = Math.min(lbst.min, root.val);
            sbst.size = lbst.size + rbst.size + 1;
            return sbst;

        }

        sbst.isbst = false;
        sbst.max = Math.max(rbst.max, Math.max(lbst.max, root.val));
        sbst.min = Math.min(rbst.min, Math.min(lbst.min, root.val));
        sbst.size = Math.max(lbst.size, rbst.size);
        return sbst;

    }

    public static void main(String[] args) {
        LargestBSTSubtree lbt = new LargestBSTSubtree();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] preorder = new int [n];
        int [] inorder = new int [n];
        for (int i = 0; i < inorder.length; i++) {
            preorder[i]=sc.nextInt();

        }
        for (int i = 0; i < inorder.length; i++) {
            inorder[i]=sc.nextInt();
        }

        lbt.buildTree(preorder, inorder);
        System.out.println(lbt.validbst());
    }

}



//
//
//
//package Lec47;
//
//public class LargestBSTSubtree {
//
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    public class BSTPair {
//        int size = 0;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        boolean isbst = true;
//    }
//
//    class Solution {
//        public int largestBSTSubtree(TreeNode root) {
//            return largestBSTSubtree(root);
//
//        }
//
//        public BSTPair largestbst(TreeNode root) {
//            if (root == null) {
//                return new BSTPair();
//            }
//
//            BSTPair lbstp = largestbst(root.left);
//            BSTPair rbstp = largestbst(root.right);
//            BSTPair sbstp = new BSTPair();
//            sbstp.min = Math.min(root.val, Math.min(lbstp.min, rbstp.min));
//            sbstp.max = Math.max(root.val, Math.max(lbstp.max, rbstp.max));
//
//            if (lbstp.isbst && rbstp.isbst && lbstp.max < root.val && rbstp.min > root.val) {
//                sbstp.isbst = true;
//                sbstp.size = lbstp.size + rbstp.size + 1;
//
//            } else {
//                sbstp.isbst = false;
//                sbstp.size = Math.max(lbstp.size, rbstp.size);
//            }
//
//            return sbstp;
//
//        }
//    }
//
//}
package Tree;

import java.util.Scanner;
public class BinaryTree {
    private class Node {
        int data;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree() {
        // TODO Auto-generated constructor stub
        this.root = CreateTree();
    }
    private Node CreateTree() {
        // TODO Auto-generated method stub
        int item = sc.nextInt();
        Node n = new Node();
        n.data = item;
        boolean hlc = sc.nextBoolean();
        if (hlc == true) {
            n.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc == true) {
            n.right = CreateTree();
        }
        return n;
    }

    public void Display() {
        Display(root);
    }

    private void Display(Node nn) {
        if (nn == null) {
            return;
        }
        String s = "";
        s = "<--" + nn.data + "-->";
        if (nn.left != null) {
            s = nn.left.data + s;
        } else {
            s = "." + s;
        }
        if (nn.right != null) {
            s = s + nn.right.data;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);

    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node nn) {
        // TODO Auto-generated method stub
        if (nn == null) {
            return;
        }
        postOrder(nn.left);
        postOrder(nn.right);
        System.out.print(nn.data + " ");

    }

    public void INOrder() {
        INOrder(root);
        System.out.println();
    }

    private void INOrder(Node nn) {
        // TODO Auto-generated method stub
        if (nn == null) {
            return;
        }
        INOrder(nn.left);
        System.out.print(nn.data + " ");
        INOrder(nn.right);

    }

    public void PreOrder() {
        PreOrder(root);
        System.out.println();
    }

    private void PreOrder(Node nn) {
        // TODO Auto-generated method stub
        if (nn == null) {
            return;
        }
        System.out.print(nn.data + " ");
        PreOrder(nn.left);


        PreOrder(nn.right);

    }

    public boolean find(int item) {

        return find(root, item);
    }

    private boolean find(Node nn, int item) {
        // TODO Auto-generated method stub
        if (nn == null) {
            return false;
        }
        if (nn.data == item) {
            return true;
        }
        boolean lf = find(nn.left, item);
        boolean rf = find(nn.right, item);
        return lf || rf;

    }

    public int Max() {

        return Max(this.root);
    }

    private int Max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int left = Max(node.left);
        int right = Max(node.right);
        return Math.max(node.data, Math.max(left, right));

    }

    public int Height() {

        return Height(this.root);
    }

    private int Height(Node node) {
        if (node == null) {
            return -1;
        }
        int left = Height(node.left);
        int right = Height(node.right);
        return Math.max(left, right) + 1;
    }

}
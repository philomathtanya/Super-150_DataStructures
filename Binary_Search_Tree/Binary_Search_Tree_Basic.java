package Binary_Search_Tree;

public class Binary_Search_Tree_Basic {

    public class Node {

        int data;
        Node left;
        Node right;

    }

    private Node root;

    public Binary_Search_Tree_Basic(int[] in) {
        // TODO Auto-generated constructor stub

        this.root = CreateTree(in, 0, in.length - 1);
    }

    private Node CreateTree(int[] in, int si, int ei) {
        // TODO Auto-generated method stub
        if (si > ei) {
            return null;
        }

        int mid = (si + ei) / 2;
        Node nn = new Node();
        nn.data = in[mid];
        nn.left = CreateTree(in, si, mid - 1);
        nn.right = CreateTree(in, mid + 1, ei);

        return nn;
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

    public static void main(String[] args) {
        int in[]={10,20,30,40,50,60,70,80,90};
        Binary_Search_Tree_Basic obj=new Binary_Search_Tree_Basic(in);
        obj.PreOrder();
    }

}

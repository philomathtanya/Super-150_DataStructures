package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Mirror_BInary_Tree {
    private class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public Mirror_BInary_Tree() {
        CreateTree();
    }
    private void CreateTree() {
        Queue<Node> qq = new LinkedList<>();
        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;
        this.root = nn;
        qq.add(nn);
        while (!qq.isEmpty()) {
         Node rv = qq.remove();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 != -1) {
                Node n = new Node();
                n.data = c1;
                rv.left = n;
                qq.add(n);
            }
            if (c2 != -1) {
                Node n = new Node();
                n.data = c2;
                rv.right = n;
                qq.add(n);
            }
        }
    }
    public boolean ismirror(Node root1,Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if (root1.data!=root2.data){
            return false;
        }
        boolean l=ismirror(root1.left,root2.right);
        boolean r=ismirror(root1.right,root2.left);
        return l&&r;
    }
    public static void main(String[] args) {
Mirror_BInary_Tree obj=new Mirror_BInary_Tree();
        if(obj.ismirror(obj.root,obj.root))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

package Tree;
import java.util.*;
public class ArrayList_of_levels_Binary_Tree {
    Scanner sc = new Scanner(System.in);
    private class Node {
        int data;
        Node left;
        Node right;
    }
    private Node root;
    public ArrayList_of_levels_Binary_Tree()
    {
        root=createtree();
    }
    public Node createtree(){
        Node nn=new Node();
        nn.data= sc.nextInt();
        if(sc.nextBoolean()){
            nn.left=createtree();
        }
        if(sc.nextBoolean()){
            nn.right=createtree();
        }
        return nn;
    }
    public void levelsinList(Node nn){
        Queue<Node> q1=new LinkedList<>();
        Queue<Node> qq=new LinkedList<>();
        List<Integer> q2=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(nn==null){
            System.out.println(result);
        return;
    }
        q2.add(nn.data);
        result.add(q2);
        q2=new ArrayList<>();
        q1.add(nn);
        while(!q1.isEmpty()){
            Node var=q1.remove();
            if(var.left!=null){
                qq.add(var.left);
                q2.add(var.left.data);
            }
            if(var.right!=null){
                qq.add(var.right);
                q2.add(var.right.data);
            }
            if(q1.isEmpty()){
                q1=qq;
                if(!q2.isEmpty()) {
                    result.add(q2);
                }
                qq=new LinkedList<>();
                q2=new ArrayList<>();
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        ArrayList_of_levels_Binary_Tree obj=new ArrayList_of_levels_Binary_Tree();
        obj.levelsinList(obj.root);
    }
}

import java.util.Scanner;
import java.util.Stack;

public class delete_node_ll_right {
    public class Node{
        int val;
        Node next;

        Node ()  {}
        Node (int val) {this.val = val;}
    }
    private Node head;
    private Node tail;
    private int size;
    public void addfirst(int item)
    {
        Node nn=new Node();

        nn.val=item;
        if(this.size==0)
        {
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;

        }
    }
    public void addlast(int item)
    {
        if(this.size==0)
        {
            addfirst(item);
        }
        else {
           Node nn=new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;
            size++;


        }

    }
    public void display()
    {
     Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
    }
    public void delete() {
        Node ans = new Node();
        Node anshead = ans;
        Node temp = head;

        Stack<Integer> st = new Stack<>();
int t=0;
       while(temp!=null){
            // nge
        while(!st.isEmpty() && temp.val > st.peek()) {
                st.pop();

        }
//        if(t==1)
//        {
//            ans.next=new Node(temp.val);
//            ans=ans.next;
//        }

           st.push(temp.val);
            temp=temp.next;}
        Stack<Integer> st1 = new Stack<>();
       while(!st.isEmpty()) {
           st1.push(st.pop());
       }
        while(!st1.isEmpty()) {
            ans.next = new Node(st1.pop());
            ans = ans.next;
        }
       head=anshead.next;
    }
    public static void main(String[] args) {
        delete_node_ll_right ll=new delete_node_ll_right();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        int k=s.nextInt();
        for (int i = 0; i <n ; i++) {
            ll.addlast(s.nextInt());
        }
        ll.delete();
        ll.display();
    }
}

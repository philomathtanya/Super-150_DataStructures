import java.util.Scanner;
import java.util.Stack;

public class Main {
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
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
	 public void display1()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public void append(int k) {
        Node res=new Node();
        Node temp=head;
        Node reshead=res;
        Node res1=new Node();
        Node temp1=head;
        Node reshead1=res1;


        for (int i = 0; i <size-k ; i++) {
            res.next=new Node(temp.val);
            res=res.next;
            temp=temp.next;
        }
        //
        for (int i = 0; i<k ; i++) {
            res1.next=new Node(temp.val);
            res1=res1.next;
            temp=temp.next;
        }


//res=1,2
//        res1=3,4,5
res1.next=reshead.next;
head=reshead1.next;



        }




    public static void main(String[] args) {
        Main ll=new Main();

            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
         
            for (int i = 0; i <n ; i++) {
                ll.addlast(s.nextInt());
            }
			   int k=s.nextInt();
			   if(k>n)
			   {
				  k=k%n;
			   }
			   
            ll.append(k);
            ll.display();
			   
//            ll.display();


        }
    }

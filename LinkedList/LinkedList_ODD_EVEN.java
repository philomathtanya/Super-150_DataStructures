import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedList_ODD_EVEN {
    private class node{
        int value;
        node next;
    }
    private node head;
    private node tail;
    private int size;
    public void addfirst(int item){
        node nn=new node();
        nn.value=item;
        if(this.size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else {
            nn.next=head;
            head=nn;
//            nn.value=item;
            size++;
        }
    }
    public void addlast(int item)
    {
        node nn=new node();
        nn.value=item;
        if(this.size==0){
            addfirst(item);
        }
        else {
            tail.next=nn;
            tail=nn;
//            head=nn;
//            nn.value=item;
            size++;
        }
    }
    public void display() {
        node ns;
        ns = head;
        while (ns != null) {
            System.out.print(ns.value + " ");
            ns = ns.next;
        }
        System.out.println();
    }
    public void seprate(){
        node temp2=head;
        List<Integer> lt=new ArrayList<>();
        List<Integer> lt2=new ArrayList<>();
        while(temp2!=null)
        {
            if(temp2.value%2==0)
            {
             lt.add(temp2.value);
            }else
            {
                lt2.add(temp2.value);
            }
            temp2=temp2.next;
        }
        temp2=head;
        int i=0;
        while(i< lt2.size() && temp2!=null)
        {
            temp2.value=lt2.get(i);
            temp2=temp2.next;
            i++;
        }
         i=0;
        while(i< lt.size() && temp2!=null)
        {
            temp2.value=lt.get(i);
            temp2=temp2.next;
            i++;
        }
//        System.out.println(lt+"  "+lt2);
    }

    public static void main(String[] args) throws Exception {
        LinkedList_ODD_EVEN ll = new LinkedList_ODD_EVEN();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            ll.addlast(s.nextInt());
        }
        ll.seprate();
        ll.display();
//ll.display();
    }
}

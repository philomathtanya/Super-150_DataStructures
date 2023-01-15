package Linked_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kth_node_from_Last {
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
    static int i=0;
public void getlastelement( node temp,int k)
{

    if(temp==null)
        return;
    getlastelement(temp.next,k);
    if(++i==k){
        System.out.println(temp.value);
    }
}
        public static void main(String[] args) throws Exception {
            Kth_node_from_Last ll = new Kth_node_from_Last();
            Scanner s=new Scanner(System.in);
//            int n=s.nextInt();
            while(true) {
                int num=s.nextInt();
                if(num!=-1)
                ll.addlast(num);
                else
                    break;
            }
            int k=s.nextInt();
//            System.out.println(ll.head.value);
            ll.getlastelement(ll.head, k);
ll.display();
        }
    }

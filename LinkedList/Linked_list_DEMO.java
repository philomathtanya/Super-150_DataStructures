public class Linked_list_DEMO {
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
    private node getnode(int k) throws Exception{
        if(k<0 || k>=size){
    throw new Exception("K not in range");
        }
        node temp=head;
        for (int i = 1; i <=k ; i++) {
            temp=temp.next;
        }
        return temp;
    }
     public void addmid(int k,int item) throws Exception{
         if(k<0 || k>=size){
             throw new Exception("K not in range");
         }
         if(k==0){
             addfirst(item);
         }
         else if(k==size){
             addlast(item);
         }
         else {
             node temp =getnode(k-1);
//             node temp2=temp.next;
             node nn=new node();
             nn.value=item;
             nn.next=temp.next;
             temp.next=nn;
             size++;
         }
    }
    public int getFirst(){
        return head.value;
    }
    public int getlast(){
        return tail.value;
    }
    public int getatindex(int n) throws Exception{
        return getnode(n).value;
    }
    public int deletefirst(){
        node temp=head;
        if(size==1){
            head=null;
            tail=null;
            size--;
        }
        else
        {
            head=head.next;
            temp.next=null;
            size--;
        }
        return temp.value;
    }
    public int deletelast() throws Exception{
if(size==1)
    return deletefirst();
    else
{
    node ss=getnode(size-2);
    int rv= tail.value;
    tail=ss;
    tail.next=null;
    size--;
    return rv;
}
    }
    public void deleteatindex(int k) throws Exception{
        if(k==0)
             deletefirst();
        else if(k==size-2)
             deletelast();
        else{
//        node temp1=getnode(k);
        node temp2=getnode(k-1);
        node curr=temp2.next;
        temp2.next=curr.next;
        curr.next=null;
        size--;
    }}
    public void display() {
        node ns;
        ns = head;
        while (ns != null) {
            System.out.print(ns.value + " ");
            ns = ns.next;
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        Linked_list_DEMO ll=new Linked_list_DEMO();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addlast(30);
        ll.addlast(40);

        ll.addlast(50);

        ll.addlast(60);

//        ll.addmid(2,50);
        ll.display();
//        System.out.println("\n--------------------");
//        System.out.println(ll.getatindex(2));
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getlast());
//        System.out.println("----------------------");
//        ll.deletefirst();
//        ll.display();
        ll.deleteatindex(3);
        ll.display();
        ll.deleteatindex(1);
        ll.display();
//        ll.deleteatindex(3);
    }
}

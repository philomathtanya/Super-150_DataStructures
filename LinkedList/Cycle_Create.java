public class Cycle_Create {
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
    public void Cycle_Create() throws Exception{
        tail.next=getnode(2);
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
    public node hasCycle() { //FLOYD'S CYCLE DETECTION
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
    public void CycleRemovl1() { //Floyd Cycle Removel
        node meet = hasCycle();
        if (meet == null) {
            return;
        }
        node start = head;
        while (start != null) {
            node temp = meet;
            while (temp.next != meet) {
                if (temp.next == start) {
                    temp.next = null;
                    return;
                } else {
                    temp = temp.next;
                }
            }
            start = start.next;
        }
    }
    public void CycleRemovl2() {
        node meet = hasCycle();
        if (meet == null) {
            return;
        }
        int count = 1;
        node temp = meet;
        while (temp.next != meet) {

            temp = temp.next;
            count++;
        }
        node fast = head;
        for (int i = 1; i <= count; i++) {
            fast = fast.next;
        }
        node slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;

        }
        fast.next = null;

    }
    public static void main(String[] args)throws Exception {
        Cycle_Create cc = new Cycle_Create();
        cc.addlast(10);
        cc.addlast(20);
        cc.addlast(30);
        cc.addlast(40);
        cc.addlast(50);
        cc.Cycle_Create();
//        cc.display();
        cc.CycleRemovl1();
        cc.display();
    }
}

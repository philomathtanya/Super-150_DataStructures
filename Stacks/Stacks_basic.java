package Stacks;

public class Stacks_basic {
    private int[] arr;
    private int top;


    public Stacks_basic(){
    arr=new int[5];
    top=-1;
    }
    public Stacks_basic(int n){
        arr=new int[n];
        top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Exception Found!");
        }
        top++;
        arr[top]=item;
    }
    public boolean isFull(){
        return top== arr.length-1;
    }
    public int pop(){
        int rv=arr[top];
        top--;
        return rv;
    }
    public int peek() throws Exception{
        if(isFull()){
            throw new Exception("Exception Found!");
        }
        int rv=arr[top];
        return rv;
    }
    public void display(){
        for (int i = 0; i <=top ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public int Size(){
        return top+1;
    }
}
package Stacks;

import java.util.Stack;

public class Stack_Client {
    public static void main(String[] args) throws Exception {
        Stacks_basic s=new Stacks_basic();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        s.push(50);
        s.push(60);

        System.out.println("Element: "+s.peek());

    }
}

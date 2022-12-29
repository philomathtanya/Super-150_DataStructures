import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner SCAN = new Scanner(System.in);

        int Variable = SCAN.nextInt();

        int [] array3 = new int[Variable];

        for(int Z = 0; Z < Variable; Z++)
            array3[Z]= SCAN.nextInt();

        DEmo(array3);
    }

    public static void DEmo(int[] myarray1) {

        int[] myarray2 = new int[myarray1.length];

        Stack<Integer> mystack1 = new Stack<>();

        for (int P = 2 * myarray1.length - 1; P >= 0; --P) {

            while (!mystack1.empty() && myarray1[mystack1.peek()] <= myarray1[P % myarray1.length])
                mystack1.pop();
            myarray2[P % myarray1.length] = mystack1.empty() ? -1 : myarray1[mystack1.peek()];
            mystack1.push(P % myarray1.length);
        }

        for (int Q = 0; Q < myarray2.length; Q++)
            System.out.print(myarray2[Q]+" ");

    }
  
}

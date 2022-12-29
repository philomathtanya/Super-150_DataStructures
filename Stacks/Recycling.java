import java.util.*;
public class Main {

    public static int fuction1(int[] Myarray1) {
        Stack<Integer> mystack1 = new Stack<>();
        int Result = 0;
        for (int P = 0; P < Myarray1.length; P++) {

            while (!mystack1.isEmpty() && Myarray1[P] < Myarray1[mystack1.peek()]) {

                int VAr1 = P;
                int Var2 = Myarray1[mystack1.pop()];
                if (mystack1.isEmpty()) {
                    Result = Math.max(Result, Var2 * VAr1);

                } else {
                    int LOW = mystack1.peek();
                    Result = Math.max(Result, Var2 * (VAr1 - LOW - 1));
                }

            }
            mystack1.push(P);

        }

        int VAR2 = Myarray1.length;
        while (!mystack1.isEmpty()) {

            int Var3 = Myarray1[mystack1.pop()];
            if (mystack1.isEmpty()) {
                Result = Math.max(Result, Var3 * VAR2);

            } else {
                int var4 = mystack1.peek();
                Result = Math.max(Result, Var3 * (VAR2 - var4 - 1));
            }
        }

        return Result;

    }
    public static void main (String args[]) {
        Scanner Scan = new Scanner(System.in);
        int NUM = Scan.nextInt();
        int[] myarray2 = new int[NUM];
        for(int Q = 0; Q < NUM; Q++){
            myarray2[Q]= Scan.nextInt();
        }
        System.out.println(fuction1(myarray2));
    }
}

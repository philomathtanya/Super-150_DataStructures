import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        int Demo = Scan.nextInt();

        int[] Type1 = new int[Demo];

        int[] Type2 = new int[Demo];

        for (int p = 0; p < Type1.length; p++)
            Type1[p] = Scan.nextInt();

        for (int p = 0; p < Type2.length; p++)
            Type2[p] = Scan.nextInt();

        System.out.println(DEMO(Type1, Type2));

    }

    public static int DEMO(int[] Var1, int[] VAr12) {

        int Test = 0;

        Queue<Integer> stack1 = new LinkedList<>();

        Queue<Integer> stack2 = new LinkedList<>();

        for (int p = 0; p < Var1.length; p++)
            stack1.add(Var1[p]);

        for (int Q = 0; Q < VAr12.length; Q++)
            stack2.add(VAr12[Q]);

        while (!stack1.isEmpty()) {

            if (stack1.peek() == stack2.peek()) {

                Test++;

                stack1.poll();

                stack2.poll();

            }
            else {

                int i = stack1.poll();

                stack1.add(i);

                Test++;

            }

        }
        return Test;
    }

}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Type1 = scanner.nextInt();
        int Type2 = scanner.nextInt();
        Stack<Integer> My_Stack1 = new Stack<>();
        for (int P = 0; P < Type1; P++)
            My_Stack1.push(scanner.nextInt());
        GOPLAY(My_Stack1, Type2);
    }
    public static void GOPLAY(Stack<Integer> MY_stack1, int Type2) {
        Stack<Integer> My_Stack2 = new Stack<>();
        Stack<Integer> My_Stack3 = new Stack<>();
        ArrayList<Integer> Mylist = new ArrayList<>();
        GOPLAY2(Mylist);
        for (int P = 1; P <= Type2; P++) {
            int Type1 = Mylist.get(P - 1);
            while (!MY_stack1.isEmpty()) {
                int IIG = MY_stack1.pop();
                if (IIG % Type1 == 0)
                    My_Stack3.push(IIG);
                else
                    My_Stack2.push(IIG);
            }
            while (!My_Stack3.isEmpty())
                System.out.println(My_Stack3.pop());
            MY_stack1 = My_Stack2;
            My_Stack2 = new Stack<>();
        }
        while (!MY_stack1.isEmpty())
            System.out.println(MY_stack1.pop());
    }
    public static void GOPLAY2(ArrayList<Integer> PrintArr) {
        boolean[] ARRAY2 = new boolean[100001];
        ARRAY2[0] = true;
        ARRAY2[1] = true;
        for (int p = 2; p * p <= 100000; p++) {
            if (ARRAY2[p] == false) {
                PrintArr.add(p);
                for (int mul = 2; mul * p <= 100000; mul++)
                    ARRAY2[p * mul] = true;
            }
        }
        for (int y = 2; y <= 100000; y++) {
            if (!ARRAY2[y])
                PrintArr.add(y);
        }
    }
}

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        Stack<Integer> My_Stack = new Stack<>();
        int Num = Scan.nextInt();
        int EXAMP =1;

        while(EXAMP <= Num){
            int P = Scan.nextInt();
            if(P == 1){
                if(!My_Stack.isEmpty()){
                    System.out.println(My_Stack.peek());
                    My_Stack.pop();
                }
                else{
                    System.out.println("No Code");
                }
            }
            else{
                int Exp2 = Scan.nextInt();
                My_Stack.push(Exp2);
            }
            EXAMP++;
        }
    }
}

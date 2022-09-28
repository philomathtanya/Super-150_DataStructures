import java.util.Scanner;

public class Fibonacci_nth_Element_Recursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Number : ");
        int n=s.nextInt();
        Fib(n);
    }
    public static int Fib(int n){
        if(n==0 ||n==1){
            return n;
        }

        int f1=Fib(n-1);
        int f2=Fib(n-2);
        return f1+f2;
    }
}

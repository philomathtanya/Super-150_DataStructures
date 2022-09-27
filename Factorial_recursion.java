import java.util.Scanner;

public class Factorial_recursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n)
    {
        if(n==0){
            return 1;
        }
        int ft=fact(n-1);
        return n*ft;
    }
}

import java.util.Scanner;

public class Factorial_Tail_Resursion {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int count=1;
            System.out.println(fact(count,n));
        }
        public static int fact(int c,int n)
        {
            if(n==0){
                return c;
            }
            return fact(c*n,n-1);
        }
    }

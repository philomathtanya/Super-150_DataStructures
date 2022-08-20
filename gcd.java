import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int divisor;
        int dividend;
        Scanner s=new Scanner(System.in);
        divisor=s.nextInt();
        dividend=s.nextInt();
        while(dividend % divisor !=0)
        {
            int rem=dividend % divisor;
            dividend=divisor;
            divisor=rem;

        }
        System.out.println(divisor);
    }
}

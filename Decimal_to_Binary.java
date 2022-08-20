import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int i=1;
        while(n>0)
        {
            int rem=n%2;
            sum=sum+rem*i;
            n=n/2;
            i=i*10;
        }

        System.out.println(sum);
    }
}

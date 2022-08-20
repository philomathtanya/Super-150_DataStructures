import java.util.Scanner;

public class Base_5_to_10 {
        public static void main(String[] args) {
            System.out.println("Enter the number:");
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int sum=0;
            int i=1;
            while(n>0)
            {
                int rem=n%10;
                sum=sum+rem*i;
                n=n/10;
                i=i*5;
            }

            System.out.println(sum);
        }
    }




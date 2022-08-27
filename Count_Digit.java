import java.util.Scanner;

public class Count_Digit {
    public static void main(String args[]) {
        Scanner s=new Scanner (System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int c=0;
        while(n1>0)
        {
            int rem=n1%10;
            if(rem==n2)
            {
                c++;
            }
            n1/=10;
        }
        System.out.print(c);
    }

}

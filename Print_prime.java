import java.util.Scanner;

public class Print_prime {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=1;
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    t=0;
                    break;

                }
                else{
                    t=1;

                }

            }
            if(t==1)
            {
                System.out.println(i);
            }

        }
    }
}


